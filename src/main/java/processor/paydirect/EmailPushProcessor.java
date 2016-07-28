package processor.paydirect;

import com.fasterxml.jackson.xml.XmlMapper;
import data.dto.Currency;
import data.dto.Payment;
import facade.dto.EmailRequest;
import processor.paydirect.impl.IProcessor;
import util.PaymentNotificationException;
import util.comms.RabbitMqUtil;
import util.config.SystemSettingFactory;
import util.datatype.CurrencyUtil;

import java.io.IOException;
import java.util.List;

public class EmailPushProcessor implements IProcessor {

    @Override
    public void execute(Payment payment) throws Exception {
        if (payment == null || payment.getAmount() == 0)
            PaymentNotificationException.raiseError("[EmailNotifierError] : invalid request (see amount/object)");

        String mailBody = null;
        String mailSubject = "";
        String toEmailAddress = "";
        String sysMailingAddress = SystemSettingFactory.SystemSetting().getSystemEmailAddress();
        String nairaSymbol = SystemSettingFactory.SystemSetting().getNairaSymbol();
        String customerReference = payment.getCustReference() != null ? payment.getCustReference() : payment.getCustomerNumberMask();
        List<Currency> currencies = new Currency().execute("{call dbo.uspGetAllCurrency()}", null);

        Currency defaultCurrency = CurrencyUtil.filterCurrencyByCode(currencies, "NGN");
        if (defaultCurrency != null) {
            mailBody += nairaSymbol + customerReference;
            System.out.println("code: //" + defaultCurrency.getCurrencySymbol());
        }

        //build request.
        String xmlRequest = buildEmailXmlRequest(mailBody, mailSubject, sysMailingAddress, toEmailAddress);
        RabbitMqUtil.pushMessage(xmlRequest, "pnsMailingQueue");
    }

    private static String buildEmailXmlRequest(String mailBody, String mailSubject, String sysMailingAddress, String toEmailAddress) throws IOException {

        EmailRequest req = new EmailRequest();
        req.setBccAddress("isw.bss@theswitch.com");
        req.setCcAddress("isw.bss@theswitch.com");
        req.setContentType("text/html");
        req.setMsgBody(mailBody);
        req.setMsgSubject(mailSubject);
        req.setToAddress(toEmailAddress);
        req.setMsgSender(sysMailingAddress);
        req.setMsgSubject("testing");

        XmlMapper mapper = new XmlMapper();
        return mapper.writeValueAsString(req);
    }
}

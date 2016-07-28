import com.microsoft.sqlserver.jdbc.SQLServerException;
import data.dto.AutogateProcessor;
import data.dto.Payment;
import data.dto.User;
import facade.business.AutogateProcessorFactory;
import facade.business.PnsProcessorFactory;
import facade.dto.PnsDataProvider;
import org.apache.log4j.Logger;
import processor.paydirect.EmailPushProcessor;
import java.util.*;
import java.util.concurrent.*;

public class Ignition {


    final static Logger logger = Logger.getLogger(Ignition.class);
    public static Queue<Payment> paymentsQueue = new ConcurrentLinkedDeque<>();

    public static void main(String[] args) throws InstantiationException, IllegalAccessException, InterruptedException, SQLServerException {

        logger.debug("starting..");
        EmailPushProcessor proc = new EmailPushProcessor();
        PnsProcessorFactory.trigger(proc);

        User dao = new User();
        Map<String, Object> params = new HashMap<>();
        params.put("id", 2);

        User res = dao.executeSingle("{call dbo.uspSelectUser(?)}", params);
        if (res != null) {
            logger.debug(String.format("found user: //%s", res.getName()));
        }

        AutogateProcessor autogateProcessor = new AutogateProcessor();
        List<AutogateProcessor> processors = autogateProcessor.execute("{call dbo.uspSelectAutogateProcessors()}", null);
        AutogateProcessorFactory.trigger(processors);

        for (int i = 0; i < 1000; i++) {
            long _stan = PnsDataProvider.SystemStan.addAndGet(1);
            Ignition.paymentsQueue.add(new Payment());
            logger.debug("stan: " + _stan);
        }

        TimeUnit.SECONDS.sleep(3);
    }
}

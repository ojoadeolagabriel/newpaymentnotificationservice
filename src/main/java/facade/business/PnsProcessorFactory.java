package facade.business;

import data.dto.Payment;
import processor.paydirect.impl.IProcessor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PnsProcessorFactory {

    public static void trigger(IProcessor processor){
        ExecutorService processorEmail = Executors.newSingleThreadExecutor();
        processorEmail.submit(()->{
            try {
                Payment payment = new Payment();
                payment.setAmount(1000);
                processor.execute(payment);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
        processorEmail.shutdown();
    }
}

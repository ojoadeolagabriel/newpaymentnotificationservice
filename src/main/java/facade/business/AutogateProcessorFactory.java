package facade.business;

import data.dto.AutogateProcessor;
import org.apache.log4j.Logger;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

public class AutogateProcessorFactory {

    final static Logger logger = Logger.getLogger(AutogateProcessorFactory.class);
    static AtomicLong totalrequest = new AtomicLong();

    /**
     * trigger all processors
     * @param processors
     */
    public static void trigger(List<AutogateProcessor> processors) {
        for (AutogateProcessor proc : processors) {
            ExecutorService bankExecutor = Executors.newSingleThreadExecutor();
            bankExecutor.submit(() -> {
                try {
                    runBank(proc);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
            bankExecutor.shutdown();
        }
    }

    /**
     * process bank.
     * @param processor
     * @throws InterruptedException
     */
    private static void runBank(AutogateProcessor processor) throws InterruptedException {
        for (int i = 0; i < 1000; i++) {
            long currCounter = totalrequest.addAndGet(1);
            TimeUnit.MILLISECONDS.sleep(processor.getDelayPerCycle());
            logger.debug(String.format("[%d] -> processing [%s] @ %d", currCounter,processor.getProcessorDescription(), i));
        }
    }

}

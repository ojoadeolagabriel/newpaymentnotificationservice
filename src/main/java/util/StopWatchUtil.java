package util;

public class StopWatchUtil implements AutoCloseable{

    private long startTimeLocalNS;

    public StopWatchUtil(){
        startTimeLocalNS = System.nanoTime();
    }

    public long elapsed(boolean reset){
        long stopTime = System.nanoTime();
        long interval = (stopTime - startTimeLocalNS);

        if(reset)
            startTimeLocalNS = System.nanoTime();

        return interval;
    }

    @Override
    public void close() throws Exception {
        long closeTime = System.nanoTime();
    }
}

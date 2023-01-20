package task1;

import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        long startTime = System.nanoTime();
            new ThreadFiveSec().start();
        while(true){
            TimeUnit.SECONDS.sleep(1L);
            long endTime = System.nanoTime();
            long timeElapsed = endTime - startTime;
            System.out.println("time elapsed in sec: "+timeElapsed/1000000000);
        }

    }
}
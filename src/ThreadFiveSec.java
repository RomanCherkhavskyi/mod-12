import java.util.concurrent.TimeUnit;

public class ThreadFiveSec extends Thread{
    @Override
    public void run() {
        while (true){

            try {
                TimeUnit.SECONDS.sleep(5L);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println("5 sec ago");
        }

    }
}

/*

        long startTime = System.nanoTime();
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        long endTime = System.nanoTime();

        long timeElapsed = endTime - startTime;

        System.out.println("time in nanosec: "+timeElapsed);
        System.out.println("time in mikrosec: "+timeElapsed/1000);
        System.out.println("time in milisec: "+timeElapsed/1000000);
        System.out.println("time in sec: "+timeElapsed/1000000000);
 */
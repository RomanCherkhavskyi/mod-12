package task2;

public class ThreadBuzz extends Thread{

    private int number;
    public ThreadBuzz(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        if (number % 5 == 0){
            Main.correct = "Buzz";
        }
    }
}

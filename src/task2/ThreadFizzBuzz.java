package task2;

public class ThreadFizzBuzz extends Thread{

    private int number;
    public ThreadFizzBuzz(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        if (number % 3 == 0 && number % 5 == 0){
            Main.correct = "FizzBuzz";
        }
    }
}

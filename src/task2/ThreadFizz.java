package task2;

public class ThreadFizz extends Thread{

    private int number;
    public ThreadFizz(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        if (number % 3 == 0 ){
            Main.correct = "Fizz";
        }
    }
}

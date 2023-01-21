package task2;


public class Number {
    private int number = 0;

    public synchronized int getNumber() {
        return number;
    }

    public synchronized void setNumber(int number) {
        this.number = number;
    }


}

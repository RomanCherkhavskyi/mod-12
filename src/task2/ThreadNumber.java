package task2;

import java.util.Arrays;

public class ThreadNumber extends Thread{

    @Override
    public void run() {
        System.out.println("result = " + Main.result);
    }
}

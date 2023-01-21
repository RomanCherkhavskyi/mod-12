package task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Main {

    public static int n = 31;
    public static String correct = "";

    public static void main(String[] args) throws InterruptedException {

        Number number = new Number();

        ArrayList<String> result = new ArrayList<>();

        for (int i = 1; i < n; i++) {
            number.setNumber(i);
            correct = Integer.toString(number.getNumber());
            new ThreadBuzz(number.getNumber()).start();
            TimeUnit.MILLISECONDS.sleep(10);
            new ThreadFizz(number.getNumber()).start();
            TimeUnit.MILLISECONDS.sleep(10);
            new ThreadFizzBuzz(number.getNumber()).start();
            TimeUnit.MILLISECONDS.sleep(10);
//            new ThreadNumber().start();

            result.add(correct);
        }
        System.out.println("result = " + result);




    }

}

/*
Завдання 2
Напишіть програму, що виводить в консоль рядок, що складається з чисел від 1 до n, але з заміною деяких значень:

якщо число ділиться на 3 - вивести fizz
якщо число ділиться на 5 - вивести buzz
якщо число ділиться на 3 і на 5 одночасно - вивести fizzbuzz
Наприклад, для n = 15, очікується такий результат: 1, 2, fizz, 4, buzz, fizz, 7, 8, fizz, buzz, 11, fizz, 13, 14, fizzbuzz.

Програма повинна бути багатопотоковою, і працювати з 4 потоками:

Потік A викликає fizz(), щоб перевірити, чи ділиться число на 3,
і якщо так - додати в чергу на виведення для потоку D рядок fizz.

Потік B викликає buzz(), щоб перевірити, чи ділиться число на 5,
і якщо так - додати в чергу на виведення для потоку D рядок buzz.

Потік C викликає fizzbuzz(), щоб перевірити, чи ділиться число на 3 та 5 одночасно,
і якщо так - додати в чергу на виведення для потоку D рядок fizzbuzz.

Потік D викликає метод number(), щоб вивести наступне число з черги, якщо є таке число для виведення.
 */

/*
   Number number = new Number();

        ArrayList<String> result = new ArrayList<>();

        for (int i = 1; i < n; i++) {
            number.setNumber(i);
            correct = Integer.toString(number.getNumber());
            new ThreadBuzz(number.getNumber()).start();
            TimeUnit.MILLISECONDS.sleep(10);
            new ThreadFizz(number.getNumber()).start();
            TimeUnit.MILLISECONDS.sleep(10);
            new ThreadFizzBuzz(number.getNumber()).start();
            TimeUnit.MILLISECONDS.sleep(10);
//            new ThreadNumber().start();

            result.add(correct);
        }

        System.out.println("result = " + result);
 */
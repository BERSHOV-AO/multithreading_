package ru.senla.task1;

import static java.lang.Thread.sleep;

public class Main {
    public static void main(String[] args) {
        try {
            Thread thread = new Thread(new SleepThread());
            Thread thread2 = new Thread(new SlowThread());
            System.out.println(thread.getState());
            thread.start();
            thread2.start();
            sleep(500);
            System.out.println(thread.getState());
            System.out.println(thread2.getState());
            Object a = SlowThread.getA();
            synchronized (a) {
                a.notify();
            }

            System.out.println(thread2.getState());
            sleep(2000);
            System.out.println(thread2.getState());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

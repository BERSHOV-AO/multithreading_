package ru.senla.task2;

public class TwoThreadNames {
    public static void main(String[] args) {
        MyThread thread1 = new MyThread("Thread 1");
        MyThread thread2 = new MyThread("Thread 2");
        thread1.start();
        thread2.start();
    }

    static class MyThread extends Thread {
        private Thread thread;

        public MyThread(String name) {
            this.thread = new Thread(this, name);
        }

        @Override
        public void run() {
            for (int i = 0; i < 5; i++) {
                synchronized (TwoThreadNames.class) {
                    System.out.println(thread.getName());
                    TwoThreadNames.class.notify();
                    try {
                        Thread.sleep(200);
                        TwoThreadNames.class.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }
    }
}

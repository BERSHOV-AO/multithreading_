package ru.senla.task4;

import java.time.LocalTime;

public class TimeInterval implements Runnable {
    private int intervalTimeSec;

    public TimeInterval(int intervalTimeSec) {
        this.intervalTimeSec = intervalTimeSec;
    }

    @Override
    public void run() {
        while (true) {
            System.out.println("System current time: " + LocalTime.now());
            try {
                Thread.sleep(intervalTimeSec * 1000);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        TimeInterval timeInterval = new TimeInterval(1);
        Thread timeThread = new Thread(timeInterval);
        timeThread.start();
    }
}





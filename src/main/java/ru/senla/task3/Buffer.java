package ru.senla.task3;

public class Buffer {
    private int data;
    private boolean empty = true;

    public synchronized void produce(int value) {
        while (!empty) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        data = value;
        empty = false;
        System.out.println("Produced: " + value);
        notify();
    }

    public synchronized int consume() {
        while (empty) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        int consumedData = data;
        empty = true;
        System.out.println("Consumed: " + consumedData);
        notify();
        return consumedData;
    }
}

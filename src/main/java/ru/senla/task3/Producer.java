package ru.senla.task3;

import java.util.Random;

class Producer implements Runnable {
    private Buffer buffer;
    private Random random;

    public Producer(Buffer buffer) {
        this.buffer = buffer;
        this.random = new Random();
    }

    @Override
    public void run() {
        while (true) {
            int value = random.nextInt(100); // рандом числа от 0 до 99
            buffer.produce(value);
            try {
                Thread.sleep(1000); // Задержка для имитации генерации чисел
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

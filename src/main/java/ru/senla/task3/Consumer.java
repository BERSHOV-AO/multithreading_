package ru.senla.task3;

class Consumer implements Runnable {
    private Buffer buffer;

    public Consumer(Buffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        while (true) {
            int consumedData = buffer.consume();
            try {
                Thread.sleep(1500); // Задержка для имитации потребления чисел
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

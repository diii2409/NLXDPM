package Buoi2;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

class Producer extends Thread {
    private BlockingQueue<Integer> queue;
    private int maxSize;

    public Producer(BlockingQueue<Integer> queue, int maxSize) {
        this.queue = queue;
        this.maxSize = maxSize;
    }

    public void run() {
        int product = 0;
        try {
            while (!Thread.currentThread().isInterrupted()) {
                Thread.sleep(1000);
                if (queue.size() < maxSize) {
                    product++;
                    queue.put(product);
                    System.out.println("San xuat san pham #" + product);
                } else {
                    System.out.println("Kho day - ngung san xuat");
                }
            }
        } catch (InterruptedException e) {
            System.out.println("Producer bi gian doan.");
        }
    }
}

class Consumer extends Thread {
    private BlockingQueue<Integer> queue;

    public Consumer(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    public void run() {
        try {
            while (!Thread.currentThread().isInterrupted()) {
                Thread.sleep(1500);
                if (!queue.isEmpty()) {
                    int product = queue.take();
                    System.out.println("Tieu thu san pham #" + product);
                } else {
                    System.out.println("Kho het hang, tam dung tieu thu");
                }
            }
        } catch (InterruptedException e) {
            System.out.println("Consumer bi gian doan.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(5); // Kho chua toi da 5 san pham
        Producer producer = new Producer(queue, 5);
        Consumer consumer = new Consumer(queue);

        producer.start();
        consumer.start();

        try {
            System.in.read();
        } catch (Exception e) {
            e.printStackTrace();
        }

        producer.interrupt();
        consumer.interrupt();
    }
}

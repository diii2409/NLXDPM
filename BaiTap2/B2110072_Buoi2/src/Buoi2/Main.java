package Buoi2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        
        Producer producer = new Producer(warehouse);
        Consumer consumer = new Consumer(warehouse);
        
        Thread producerThread = new Thread(producer);
        Thread consumerThread = new Thread(consumer);
        
        producerThread.start();
        consumerThread.start();
        
        // Tạo một luồng riêng để chờ sự kiện nhấn phím
//        Thread keyboardThread = new Thread(() -> {
            System.out.println("Nhấn phím bất kỳ để dừng chương trình...");
            Scanner scanner = new Scanner(System.in);
            scanner.nextLine(); // Chờ sự kiện nhấn phímx
            producer.stop();
            consumer.stop();
//        });
//        keyboardThread.start();

    }
}


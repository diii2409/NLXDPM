package Buoi2;

import java.util.LinkedList;

public class Warehouse {
	private LinkedList<Integer> products = new LinkedList<>();
    private final int MAX_CAPACITY = 5;

    public synchronized void produce() {
        while (products.size() >= MAX_CAPACITY) {
            try {
                System.out.println("Kho đầy - ngưng sản xuất");
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        products.addLast(products.size() + 1);
        System.out.println("Sản xuất sản phẩm #" + products.size());
        notifyAll();
    }

    public synchronized void consume() {
        while (products.isEmpty()) {
            try {
                System.out.println("Kho hết hàng, tạm dừng tiêu thụ");
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        int product = products.removeFirst();
        System.out.println("Tiêu thụ sản phẩm #" + product);
        notifyAll();
    }
}

package Buoi2;

import java.util.LinkedList;
import java.util.List;

public class Warehouse {
	private List<Integer> products = new LinkedList<>();
    private final int MAX_CAPACITY = 5;

    public synchronized void produce() {
        if (products.size() >= MAX_CAPACITY) {
        	System.out.println("Kho đầy - ngưng sản xuất");
        }
        else {
        	int product = products.size() + 1;
        	products.add(product);
            System.out.println("Sản xuất sản phẩm #" + product);
        }
    }

    public synchronized void consume() {
        if (products.isEmpty()) {
        	System.out.println("Kho hết hàng, tạm dừng tiêu thụ");
        }
        else {
        	int product = products.remove(0);
            System.out.println("Tiêu thụ sản phẩm #" + product);
        }
    }
}

package Buoi2;

public class Buffer {
    private final int capacity;
    private Product[] products;
    private int head;
    private int tail;

    public Buffer(int capacity) {
        this.capacity = capacity;
        products = new Product[capacity];
        head = 0;
        tail = 0;
    }

    public synchronized void put(Product product) throws InterruptedException {
        while (isFull()) {
            wait();
        }
        products[tail] = product;
        tail = (tail + 1) % capacity;
        notifyAll();
    }

    public synchronized Product get() throws InterruptedException {
        while (isEmpty()) {
            wait();
        }
        Product product = products[head];
        head = (head + 1) % capacity;
        notifyAll();
        return product;
    }

    public synchronized boolean isFull() {
        return (tail + 1) % capacity == head;
    }

    public synchronized boolean isEmpty() {
        return head == tail;
    }
}

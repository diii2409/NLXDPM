package Buoi2;

public class Producer implements Runnable {
    private Buffer buffer;

    public Producer(Buffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        int id = 1;
        while (true) {
            try {
                String name = "Sản phẩm #" + id++;
                Product product = new Product(id, name);
                buffer.put(product);
                System.out.println("Sản xuất " + product);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

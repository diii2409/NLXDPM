package Buoi2;

public class Consumer implements Runnable {
	private final Warehouse warehouse;
    private volatile boolean running = true;

    public Consumer(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    @Override
    public void run() {
        while (running) {
            try {
                Thread.sleep(2000);
                warehouse.consume();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void stop() {
        running = false;
    }
}

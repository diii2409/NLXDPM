package Buoi2;

public class Producer implements Runnable {
	 private final Warehouse warehouse;
	 private volatile boolean running = true;

	 public Producer(Warehouse warehouse) {
		 this.warehouse = warehouse;
	 }

	    @Override
	 public void run() {
	     while (running) {
	            try {
	                Thread.sleep(1000);
	                warehouse.produce();
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	        }
	    }

	public void stop() {
	    running = false;
	}
}


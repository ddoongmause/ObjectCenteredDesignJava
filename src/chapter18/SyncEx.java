package chapter18;

public class SyncEx implements Runnable{
	
	private StringBuffer buffer = new StringBuffer();
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		doA();
	}



	public void doA() {
		synchronized(buffer) {
			for (int i = 0; i < 100; i++) {
				buffer.append(Thread.currentThread().getName());
				System.out.println(buffer.toString());
			}
		}
	}
	
	public static void main(String[] args) {
		SyncEx obj = new SyncEx();
		
		Thread t0 = new Thread(obj, "A");
		Thread t1 = new Thread(obj, "B");
		
		t0.start();
		t1.start();
	}
}

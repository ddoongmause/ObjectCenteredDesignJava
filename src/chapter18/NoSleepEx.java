package chapter18;

public class NoSleepEx implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		doJob();
	}
	
	public void doJob() {
		for(int i=0; i<1000; i++) {
			String name = Thread.currentThread().getName();
			System.out.println(name);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NoSleepEx ex = new NoSleepEx();
		Thread t0 = new Thread(ex);
		Thread t1 = new Thread(ex);
		
		t0.start();
		t1.start();
	}


}

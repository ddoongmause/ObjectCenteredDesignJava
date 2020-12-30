package chapter18;

public class SumEx implements Runnable{

	
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		SumEx ex = new SumEx();
		//ex.doJob();
		Thread t0 = new Thread(ex);
		Thread t1 = new Thread(ex);
		t0.start();
		t1.start();
		System.out.println("---------------------------");
	}

	public void doJob() throws Exception{
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum = sum + i;
			Thread.sleep(100);
			System.out.println(sum + ":" + this + ":" + Thread.currentThread().getName());
		}
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			doJob();
		}catch (Exception e){
			e.printStackTrace();
		}
	}
}

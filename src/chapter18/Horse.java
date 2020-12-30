package chapter18;

public class Horse extends Thread{
	
	private String name;
	private int pos;
	
	public Horse(String name) {
		this.name = name;
	}
	
	public void race() {
		for (int i = 0; i < 100; i++) {
			pos = pos + (int)(Math.random() * 100);
			System.out.println("Horse :" + name + ":" + pos);
			try {
				Thread.sleep(100);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}//end catch
		}//end for
	}//end method
	
	//run() 메소드에는 동시에 진행될 작업을 기록한다.
	public void run() {
		race();
	}
	
	public static void main(String[] args) {
		Horse h1 = new Horse("1번말");
		Horse h2 = new Horse("2번말");
		Horse h3 = new Horse("3번말");
		
		h1.start();
		h2.start();
		h3.start();
	}
}

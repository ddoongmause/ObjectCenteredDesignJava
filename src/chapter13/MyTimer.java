package chapter13;

import java.util.Timer;
import java.util.TimerTask;

public class MyTimer {
	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		Timer t = new Timer(true);
		TimerTask task1 = new MyTimeTask();
		System.out.println("task1�� ��� �Ŀ� ����˴ϴ�.");
		TimerTask task2 = new YourTimeTask();
		System.out.println("task1�� 10�� �Ŀ� ����˴ϴ�.");
		t.schedule(task1, 1000);
		t.schedule(task2, 10000);
		
		Thread.sleep(11000);
		System.out.println("���� ��� ���� �����մϴ�.");
	}
}

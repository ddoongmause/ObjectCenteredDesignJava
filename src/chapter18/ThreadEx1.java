package chapter18;

public class ThreadEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("이 프로그램은 실행 됩니다. ");
		String name = Thread.currentThread().getName();
		System.out.println("실행되고 있는 스레드의 이름:" + name);	
		}
}

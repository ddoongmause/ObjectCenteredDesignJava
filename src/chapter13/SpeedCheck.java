package chapter13;

public class SpeedCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "A";
		String target = "B";
		
		//������ ���� ���� ���� ����
		long start = System.currentTimeMillis();
		
		for (int i = 0; i < 90000; i++) {
			str = str + target;
		}
		
		long end = System.currentTimeMillis();
		System.out.println(end - start);
	}

}

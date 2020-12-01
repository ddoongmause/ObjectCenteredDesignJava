package chapter13;

public class SpeedCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "A";
		String target = "B";
		
		//루프를 돌기 전에 현재 시작
		long start = System.currentTimeMillis();
		
		for (int i = 0; i < 90000; i++) {
			str = str + target;
		}
		
		long end = System.currentTimeMillis();
		System.out.println(end - start);
	}

}

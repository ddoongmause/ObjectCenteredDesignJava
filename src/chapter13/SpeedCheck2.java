package chapter13;

public class SpeedCheck2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder str = new StringBuilder("A");
		String target = "B";
		
		//로프를 돌기 전 현재 시각
		long start = System.currentTimeMillis();
		
		for(int i = 0; i < 90000; i++) {
			str.append(target);
		}
		
		long end = System.currentTimeMillis();
		
		System.out.println(end - start);
	}

}

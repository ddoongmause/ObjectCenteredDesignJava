package chapter14;

public class ExceptionEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 10;
		int y = 0;
		try {
			System.out.println(x/y);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("AAA");
		System.out.println("BBB");
		System.out.println("CCC");
	}

}

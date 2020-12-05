package chapter14;
import java.util.Scanner;

public class ExceptionEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int x = 0;
		int y = 0;
		try {
			//숫자를 입력받는 부분
			System.out.println("x 값을 입력해 주세요");
			x = scanner.nextInt();
			
			System.out.println("y 값을 입력해 주세요");
			y = scanner.nextInt();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
		//데이터를 처리하는 부분
		System.out.println("두 수의 합은" + (x+y));
	}

}

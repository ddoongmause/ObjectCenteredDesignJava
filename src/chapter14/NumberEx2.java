package chapter14;

import java.util.Scanner;

public class NumberEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		//사용자가 고의로 숫자 변환이 불가능한 값을 입력하면 예외 발생
		int input = s.nextInt();
		System.out.println(input);
	}

}

package chapter13;

import java.util.Scanner;

public class ScannerTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ���.");
		int num = s.nextInt();
		System.out.println("���ڸ� �Է��ϼ���.");
		String str = s.nextLine();
		System.out.println("����: " + num);
		System.out.println("����: " + str);
	}

}

package chapter14;
import java.util.Scanner;

public class ExceptionEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int x = 0;
		int y = 0;
		try {
			//���ڸ� �Է¹޴� �κ�
			System.out.println("x ���� �Է��� �ּ���");
			x = scanner.nextInt();
			
			System.out.println("y ���� �Է��� �ּ���");
			y = scanner.nextInt();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
		//�����͸� ó���ϴ� �κ�
		System.out.println("�� ���� ����" + (x+y));
	}

}

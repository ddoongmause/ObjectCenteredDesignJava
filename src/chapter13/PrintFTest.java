package chapter13;

public class PrintFTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 100;
		System.out.printf("���� i�� ���� %d\n", i);
		System.out.printf("%d * %d = " + (i*i) , i, i);
		
		String str1 = "ABC";
		String str2 = "def";
		
		System.out.printf("\n���ڿ��� %s\n", str1);
		System.out.printf("���ڿ��� %s\n", "ABCDEFG");
		System.out.printf("�빮�ڷδ� %S\n", str2);
		
		double d = 123.45678;
		System.out.printf("DOUBLE d %.3f\n", d);
	
		double[] arr = {1.23, 33.444, 3.5, 123};
		
		System.out.printf("%10.3f\n", arr[0]);
		System.out.printf("%10.3f\n", arr[1]);
		System.out.printf("%10.3f\n", arr[2]);
		System.out.printf("%10.3f\n", arr[3]);
		
		System.out.printf("%010.3f\n", arr[0]);
		System.out.printf("%010.3f\n", arr[1]);
		System.out.printf("%010.3f\n", arr[2]);
		System.out.printf("%010.3f\n", arr[3]);
	}

}

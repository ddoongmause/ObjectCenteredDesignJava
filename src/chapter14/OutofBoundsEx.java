package chapter14;

public class OutofBoundsEx {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 2, 3};
		System.out.println("�迭�� ����" + arr.length);
		//�ε�����ȣ�� 0, 1, 2������ ����
		System.out.println(arr[3]);
	}

}

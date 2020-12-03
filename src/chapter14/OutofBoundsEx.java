package chapter14;

public class OutofBoundsEx {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 2, 3};
		System.out.println("배열의 길이" + arr.length);
		//인덱스번호는 0, 1, 2까지만 존재
		System.out.println(arr[3]);
	}

}

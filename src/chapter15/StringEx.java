package chapter15;

import java.util.Arrays;

public class StringEx {

	public static void main(String[] args) {
		String str = "한글";
		byte[] arr = str.getBytes();
		System.out.println(Arrays.toString(arr));
	}
}

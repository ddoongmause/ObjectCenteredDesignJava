package chapter13;

import java.util.Random;

public class RandomTest1 {

	public static void main(String[] args) {
		Random random = new Random();
		int value = random.nextInt();
		System.out.println(value);
	}
}

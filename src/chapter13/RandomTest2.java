package chapter13;

import java.util.Random;

public class RandomTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		for(int i=0; i<10; i++) {
			int value = r.nextInt(10);
			System.out.println(value);
		}
	}

}

package chapter14;

import java.util.HashMap;

public class ComposerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Composer c1 = new Composer();
		Composer c2 = new Composer();
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		
		String str1 = new String("AAAA");
		String str2 = new String("AAAA");
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		for (int i = 0; i < 10; i++) {
			map.put(i,  "AAAA" + i);
		}
		String data = map.get(5);
		System.out.println(data);
		
		Integer i1 = new Integer(123);
		Integer i2 = new Integer(123);
		System.out.println(i1.hashCode());
		System.out.println(i2.hashCode());
	}

}

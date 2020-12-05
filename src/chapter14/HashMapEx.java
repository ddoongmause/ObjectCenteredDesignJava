package chapter14;

import java.util.HashMap;

public class HashMapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		for (int i = 0; i < 100; i++) {
			map.put(i,  "AAAA" + i);
		}
		/*
		 * map.put(0, "BBBB"); map.put(0, "CCCC"); map.put(0, "DDDD");
		 */
		String data = map.get(5);
		System.out.println(map);
		System.out.println(data);
	}

}

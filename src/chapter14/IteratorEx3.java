package chapter14;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class IteratorEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		for (int i = 0; i < 10; i++) {
			map.put(i,  "AAAAAA" + i);
		}
		System.out.println("MAP: " + map);
		Set<Integer> keySet = map.keySet();
		Iterator<Integer> it = keySet.iterator();
		while(it.hasNext()) {
			Integer key = it.next();
			System.out.println("key : " + key);
			System.out.println("value : " + map.get(key));
		}
	}

}

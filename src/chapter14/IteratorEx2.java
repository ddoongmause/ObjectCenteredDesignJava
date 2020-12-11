package chapter14;

import java.util.HashSet;
import java.util.Iterator;

public class IteratorEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> set = new HashSet<String>();
		for (int i = 0; i < 10; i++) {
			set.add("ABC" + i);
		}
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}

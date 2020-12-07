package chapter14;

import java.util.HashSet;

public class HashSetEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> set = new HashSet<String>();
		set.add("A");
		set.add("B");
		set.add("C");
		set.add("D");
		set.add("E");
		set.add(new String("A"));
		System.out.println(set);
	}

}

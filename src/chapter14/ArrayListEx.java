package chapter14;

import java.util.ArrayList;

public class ArrayListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
		list.add("AAAA");
		list.add("BBBB");
		list.add("CCCC");
		list.add("DDDD");
		//list.add(1, "EEEE");
		String str = list.remove(1);
		System.out.println(list);
		System.out.println("str : " + str);
	}

}

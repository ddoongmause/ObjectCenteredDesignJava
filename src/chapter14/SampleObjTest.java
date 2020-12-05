package chapter14;

import java.util.ArrayList;

public class SampleObjTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SampleObj obj1 = new SampleObj("°´Ã¼1");
		SampleObj obj2 = new SampleObj("°´Ã¼2");
		SampleObj obj3 = new SampleObj("°´Ã¼3");
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3);
		ArrayList<SampleObj> list = new ArrayList<SampleObj>();
		list.add(obj1);
		list.add(obj2);
		list.add(obj3);
		System.out.println(list);
		SampleObj target = new SampleObj("°´Ã¼3");
		
		int index = list.indexOf(target);
		System.out.println("¿øÇÏ´Â °´Ã¼ÀÇ À§Ä¡´Â : " + index);
	}

}

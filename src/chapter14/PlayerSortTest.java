package chapter14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PlayerSortTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<PlayerVO> list = new ArrayList<PlayerVO>();
		
		list.add(new PlayerVO("홍길동", "투수", 1999));
		list.add(new PlayerVO("임꺽정", "포수", 2005));
		list.add(new PlayerVO("강감찬", "1루수", 2003));
		list.add(new PlayerVO("을지문덕", "2루수", 2010));
		System.out.println(list);
		/*Collections.sort(list);
		System.out.println(list);*/
		Comparator comparator = new YearComparator();
		Collections.sort(list, comparator);
		System.out.println(list);
	}

}

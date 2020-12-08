package chapter14;

import java.util.TreeSet;

public class TreeEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Player> tSet = new TreeSet<Player>(new PlayerComparator());
		Player p1 = new Player("박찬호", "한국");
		Player p2 = new Player("박지성", "한국");
		
		tSet.add(p1);
		tSet.add(p2);
		
		System.out.println(tSet);
	}

}

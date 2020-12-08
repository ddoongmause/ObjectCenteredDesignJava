package chapter14;

import java.util.Comparator;

public class PlayerComparator implements Comparator<Player> {

	@Override
	public int compare(Player p1, Player p2) {
		// TODO Auto-generated method stub
		String p1Str = p1.toString();
		String p2Str = p2.toString();
		return p1Str.compareTo(p2Str);
	}

}

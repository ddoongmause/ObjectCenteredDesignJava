package chapter14;

import java.util.Comparator;

public class YearComparator implements Comparator<PlayerVO> {

	@Override
	public int compare(PlayerVO p1, PlayerVO p2) {
		// TODO Auto-generated method stub
		//년도가 앞서면 음수가 나오게..
		return p1.getRegYear() - p2.getRegYear();
	}

}

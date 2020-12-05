package chapter14;

import java.util.HashMap;

public class MusicMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Composer, Works> map = new HashMap<Composer, Works>();
		Composer c1 = new Composer();
		
		c1.setName("베토벤");
		c1.setNation("독일");
		
		Works work1 = new Works();
		work1.setTitle("운명");
		work1.setType("교향곡");
		work1.setYear("1808");
		
		map.put(c1,  work1);
	}

}

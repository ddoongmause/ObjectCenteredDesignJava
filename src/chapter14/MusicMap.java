package chapter14;

import java.util.HashMap;

public class MusicMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Composer, Works> map = new HashMap<Composer, Works>();
		Composer c1 = new Composer();
		
		c1.setName("���亥");
		c1.setNation("����");
		
		Works work1 = new Works();
		work1.setTitle("���");
		work1.setType("�����");
		work1.setYear("1808");
		
		map.put(c1,  work1);
	}

}

package chapter10;

public class SeoulZaZangRu extends ZaZangRu {
	public void makeZamBong() {
		System.out.println("«���� ���� �� �ֽ��ϴ�.");
	}
	
	public static void main(String[] args) {
		ZaZangRu sz = new SeoulZaZangRu();
		sz.makeZaZang();
		((SeoulZaZangRu)sz).makeZamBong();
	}
}

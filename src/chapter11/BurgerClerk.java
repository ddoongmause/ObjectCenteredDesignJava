package chapter11;

public class BurgerClerk {

	private BurgerCook cook = new HotelCook();
	
	public void orderBurger() {
		System.out.println("�ֹ濡 �ܹ��Ÿ� �ֹ��մϴ�.");
		cook.makeBurger();
	}
	
	public void orderSalad() {
		System.out.println("�ֹ濡 �����带 �ֹ��մϴ�.");
		cook.makeSalad();
	}
}

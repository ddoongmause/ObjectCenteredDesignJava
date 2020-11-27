package chapter11;

public class PartTimer implements IPayable {

	private int days;
	private float pay;
	
	@Override
	public float getMonthPay() {
		// TODO Auto-generated method stub
		return days * pay;
	}

}

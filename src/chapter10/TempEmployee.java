package chapter10;

public class TempEmployee extends Employee{

	//���Ⱓ
	private int hireYear;

	public TempEmployee(String empno, String name, int pay, int hireYear) {
		super(empno, name, pay);
		// TODO Auto-generated constructor stub
		this.hireYear = hireYear;
	}

	@Override
	public double getMonthPay() {
		return pay / (double)12;
	}
	
	
	
}

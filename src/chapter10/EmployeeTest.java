package chapter10;

public class EmployeeTest {

	public static void printPay(Employee emp) {
		System.out.println("==============================");
		System.out.println(emp);
		System.out.println("==============================");
		System.out.println(emp.getMonthPay());
		System.out.println("==============================");
	}
	
	public static void main(String[] args) {
		Employee[] emps = new Employee[4];
		emps[0] = new RegularEmployee("E001", "ȫ�浿", 3000, 500);
		emps[1] = new TempEmployee("E002", "�Ӳ���", 4000, 3);
		emps[2] = new PartTimeEmployee("E003", "Ȳ����", 5, 10);
		emps[3] = new PartTimeEmployee("E004", "ȫ�浿", 10, 7);
	
		for (Employee employee : emps) {
			printPay(employee);
		}
	}
}

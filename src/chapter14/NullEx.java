package chapter14;

public class NullEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "AAAAAAAAAAAAAAAA";
		String str2 = null;
		
		System.out.println(str1);
		System.out.println(str2);
		
		//객체를 동작시켜 본다.
		System.out.println(str1.charAt(0));
		System.out.println(str2.charAt(0));
	}

}

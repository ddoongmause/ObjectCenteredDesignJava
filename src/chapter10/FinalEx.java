package chapter10;

public class FinalEx {

	public static void main(String[] args) {
		final String[] arr =new String[3];
		
		arr[0] = "aaa";
		arr[1] = "bbb";
		arr[2] = "ccc";
		//다른 배열의 리모컨을 넣어줄 수 없다.
		//컴파일 에러
		//arr= new String[5];
	}
}

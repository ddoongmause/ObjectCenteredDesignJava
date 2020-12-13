package chapter15;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class FileOutputEx {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		OutputStream out = new FileOutputStream("aaa.txt");
		String str = "이 문자열을 파일에 기록하고 싶습니다.";
		byte[] arr = str.getBytes();
		out.write(arr);
		
		//아직 끝나지 않았습니다.
		//int a = 10;
		//int b = 0;
		//int c = a/b;
		out.close();	//정상적인 경우에만 close()
	}

}


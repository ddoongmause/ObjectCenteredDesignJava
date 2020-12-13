package chapter15;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class ByteWriteWay {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String str = "이 문자열을 기록해볼까요?\n";
		//줄 바꿈을 위해서 \n 문자열을 이용
		OutputStream out = new FileOutputStream("aaa.txt");
		byte[] arr = str.getBytes();
		out.write(arr);
		out.close();
	}

}

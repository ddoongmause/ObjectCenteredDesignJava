package chapter15;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class FileInputEx {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		InputStream in = new FileInputStream("C:\\newjava\\aaa.txt");
		
		while(true) {
			//한 바이트를 읽어들인 결과
			int data = in.read();
			System.out.println(data);
			if(data == -1) {
				break;
			}
		}
	}

}

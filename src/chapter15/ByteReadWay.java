package chapter15;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Scanner;

public class ByteReadWay {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		InputStream in = new FileInputStream("aaa.txt");
		Scanner scanner = new Scanner(in);
		while(true) {
			try {
				String str = scanner.nextLine();
				System.out.println(str);
			} catch (Exception e) {
				// TODO: handle exception
				break;
			}
		}
		in.close();
	}

}

package chapter15;

import java.io.FileWriter;
import java.io.Writer;

public class WriteEx {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		String str = "이 문자열을 기록할 겁니다.\n";
		Writer writer = new FileWriter("eee.txt");
		writer.write(str);
		writer.close();
	}

}

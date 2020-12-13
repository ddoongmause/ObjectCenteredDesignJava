package chapter15;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStream;

public class DataInputEx {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		InputStream in = new FileInputStream("ddd.txt");
		DataInputStream dis = new DataInputStream(in);
		String str = dis.readUTF();
		System.out.println(str);
		dis.close();
		in.close();
	}

}

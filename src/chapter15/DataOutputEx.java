package chapter15;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class DataOutputEx {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		String str = "이 문자열을 기록해 볼까 합니다.";
		OutputStream out = new FileOutputStream("ddd.txt");
		DataOutputStream dos = new DataOutputStream(out);
		dos.writeUTF(str);
		
		//연결을 종료할 때는 연결된 순서의 역순으로 종료
		dos.close();
		out.close();
		
	}

}

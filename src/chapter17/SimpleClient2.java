package chapter17;

import java.io.DataInputStream;
import java.io.InputStream;
import java.net.Socket;

public class SimpleClient2 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Socket socket = new Socket("localhost", 8111);
		System.out.println("서버 연결 완료");
		
		InputStream in = socket.getInputStream();
		DataInputStream din = new DataInputStream(in);
		
		String msg = din.readUTF();
		System.out.println("받은 메시지:" + msg);
		din.close();
		in.close();
		socket.close();
	}

}

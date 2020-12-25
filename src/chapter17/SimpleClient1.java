package chapter17;

import java.io.InputStream;
import java.net.Socket;
import java.util.Arrays;

public class SimpleClient1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Socket socket = new Socket("localhost", 8111);
		System.out.println("서버 연결 완료");
		InputStream in = socket.getInputStream();
		byte[] basket = new byte[10];
		in.read(basket);
		System.out.println(Arrays.toString(basket));
		in.close();
		socket.close();
	}

}

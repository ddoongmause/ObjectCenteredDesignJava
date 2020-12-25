package chapter17;

import java.net.Socket;

public class SocketTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Socket socket = new Socket("localhost", 8111);
		System.out.println("연결되었습니다." + socket);
		socket.close();
	}

}

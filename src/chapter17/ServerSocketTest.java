package chapter17;

import java.net.ServerSocket;
import java.net.Socket;

public class ServerSocketTest {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		ServerSocket serverSocket = new ServerSocket(8111);
		System.out.println("클라이언트 연결 대기 중");
		Socket socket = serverSocket.accept();
		System.out.println("클라이언트 연결 : " + socket);
		socket.close();
		serverSocket.close();
	}
}

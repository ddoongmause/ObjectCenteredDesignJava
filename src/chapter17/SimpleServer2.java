package chapter17;

import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleServer2 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		String str = "이 문자열은 몇 바이트인지 모르겠습니다만...";
		ServerSocket serverSocket = new ServerSocket(8111);
		System.out.println("서버준비 완료");
		Socket socket = serverSocket.accept();
		System.out.println("클라이언트 연결 완료");
		
		OutputStream out = socket.getOutputStream();
		DataOutputStream dos = new DataOutputStream(out);
		dos.writeUTF(str);
		dos.close();
		out.close();
		socket.close();
		serverSocket.close();
	}

}

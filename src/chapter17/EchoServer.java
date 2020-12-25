package chapter17;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		ServerSocket serverSocket = new ServerSocket(8111);
		System.out.println("서버 준비 완료");
		
		Socket socket = serverSocket.accept();
		System.out.println("클라이언트 연결 완료");
		
		//읽는 스트림
		InputStream in = socket.getInputStream();
		DataInputStream dis = new DataInputStream(in);
		
		//쓰는 스트림
		OutputStream out = socket.getOutputStream();
		DataOutputStream dos = new DataOutputStream(out);
		
		while(true) {
			String userMsg = dis.readUTF();
			System.out.println("사용자 메시지:" + userMsg);
			if(userMsg.equals("EXIT")) {
				break;
			}
			//받은 메시지를 다시 전송
			dos.writeUTF(userMsg);
			dos.flush();
		}
		
		dis.close();
		in.close();
		socket.close();
	}

}

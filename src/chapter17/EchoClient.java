package chapter17;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class EchoClient {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Socket socket = new Socket("localhost", 8111);
		System.out.println("서버 연결 완료");
		
		//데이터를 보낼 준비
		OutputStream out = socket.getOutputStream();
		DataOutputStream dos = new DataOutputStream(out);
		
		//데이터를 받을 준비
		InputStream in = socket.getInputStream();
		DataInputStream din = new DataInputStream(in);
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("서버로 전송할 메시지를 입력해주세요.");
			String msg = scanner.nextLine();
			dos.writeUTF(msg);
			dos.flush();
			
			String readMsg = din.readUTF();
			System.out.println("받은메시지:" + readMsg);
			
			if(msg.equals("EXIT")) {
				break;
			}
			
		}
		//읽는 스트림 종료
		din.close();
		in.close();
		//쓰는 스트림 종료
		dos.close();
		out.close();
		socket.close();
		
	}

}

package chapter17;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class FileClient {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Socket socket = new Socket("localhost", 8111);
		Scanner scanner = new Scanner(System.in);
		
		//데이터를 보내고 받을 Stream
		//사실 InputStream 하나만 있어도 괜찮다.
		InputStream in = socket.getInputStream();
		DataInputStream din = new DataInputStream(in);
		
		OutputStream out = socket.getOutputStream();
		DataOutputStream dos = new DataOutputStream(out);
		
		System.out.println("받고 싶은 파일 이름을 선택하세요.");
		String fileNameMsg = scanner.nextLine();
		
		dos.writeUTF(fileNameMsg);
		
		System.out.println("서버에 파일 메시지를 보냈습니다.");
		System.out.println("서버가 보내는 파일 데이터를 받아봅니다.");
		
		//데이터를 저장할 FileOutputStream
		FileOutputStream fos = new FileOutputStream(fileNameMsg);
		
		while(true) {
			int data = din.read();
			if(data == -1) {
				break;
			}
			fos.write(data);
		}
		System.out.println("전송 작업이 완료되었습니다.");
		fos.close();
		dos.close();
		out.close();
		
		din.close();
		in.close();
		socket.close();
	}

}

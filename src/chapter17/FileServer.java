package chapter17;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class FileServer {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		ServerSocket serverSocket = new ServerSocket(8111);
		System.out.println("서버 준비 완료");
		Socket socket = serverSocket.accept();
		System.out.println("소켓 연결 완료");
		
		//보내고 받을 때 사용할 Stream
		InputStream in = socket.getInputStream();
		DataInputStream din = new DataInputStream(in);
		OutputStream out = socket.getOutputStream();
		DataOutputStream dos = new DataOutputStream(out);
		
		// 단계1 - 사용자가 무슨 파일을 필요로 하는지 파악한다.
		String fileNameStr = din.readUTF();
		System.out.println("사용자가 요청한 파일:" + fileNameStr);
		
		//단계 2 - 파일 데이터를 찾아내고 데이터를 읽는다.
		//파일에서 데이터를 읽어 내야 하므로 FileInputStream 필요
		FileInputStream fin = new FileInputStream("C:\\zzz\\" + fileNameStr);
		
		//단계 3 - 파일에서 데이터를 읽어내고 데이터를 보낸다.
		
		while(true) {
			int data = fin.read();
			
			if(data == -1) {
				break;
			}
			dos.write(data);
		}
		
		fin.close();
		dos.close();
		out.close();
		
		din.close();
		socket.close();
		serverSocket.close();
		
	}

}

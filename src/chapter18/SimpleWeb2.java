package chapter18;

import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class SimpleWeb2 {
	private ServerSocket serverSocket;
	public SimpleWeb2(int port) throws Exception{
		serverSocket = new ServerSocket(port);
	}
	
	public void runServer()throws Exception{
		Socket socket = serverSocket.accept();
		//브라우저가 원하는 파일 읽기
		//브라우저에 원하는 데이터 보내주기
		InputStream in = socket.getInputStream();
		Scanner scanner = new Scanner(in);
		String fileName = scanner.nextLine();
		String[] arr = fileName.split(" ");
		System.out.println(fileName);
		System.out.println(arr[1]);
		scanner.close();
		in.close();
		socket.close();
	}
	
	public static void main(String[] args) throws Exception{
		SimpleWeb2 web2 = new SimpleWeb2(8111);
		web2.runServer();
	}
}

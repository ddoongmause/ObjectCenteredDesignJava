package chapter15;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

public class FileCopy2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//읽어들일 수 있는 스트리미과 출력 가능한 스트림을 준비한다.
		InputStream in = null;
		OutputStream out = null;
		
		try {
			/*
			 * in = new FileInputStream("C:\\zzz\\bbb.txt"); out = new
			 * FileOutputStream("ccc.txt");
			 */
			URL url = new URL("https://www.freelec.co.kr");
			in = url.openStream();
			out = new FileOutputStream("ccc.txt");
			//데이터를 한번에 읽기 위한 공간
			byte[] arr = new byte[5];
			
			while(true) {
				int count = in.read(arr);
				if(count == -1) {
					break;
				}
				out.write(arr, 0, count);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			if(in != null) {
				try {
					in.close();
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
			if(out != null) {
				try {
					out.close();
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
		}
	}

}

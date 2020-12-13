package chapter15;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class FileOutputEx2 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		OutputStream out = null;
		try {
			out = new FileOutputStream("aaa.txt");
			String str = "이 문자열을 파일에 기록하고 싶습니다.";
			byte[] arr = str.getBytes();
			out.write(arr);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			if(out != null) {
				try {
					out.close();
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
		}
		
		//아직 끝나지 않았습니다.
		//int a = 10;
		//int b = 0;
		//int c = a/b;
		out.close();
	}

}

package chapter15;

import java.io.File;

public class FileEx {
	public static void main(String[] args) {
		File file = new File("aaa.txt");
		String absolutePath = file.getAbsolutePath();
		System.out.println("절대 경로 :" +absolutePath);
		boolean isFile = file.isFile();
		System.out.println("파일 여부  :" + isFile);
		boolean isDirectory = file.isDirectory();
		System.out.println("디렉터리 여부 :" + isDirectory);
		System.out.println("경로 구분자 : " + File.separator);
	}
}

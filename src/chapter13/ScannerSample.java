package chapter13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ScannerSample {
	private static BufferedReader br;
	
	static {
		br = new BufferedReader(new InputStreamReader(System.in));
	}
	public static String readLine() {
		try {
			return br.readLine();
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
	}
}

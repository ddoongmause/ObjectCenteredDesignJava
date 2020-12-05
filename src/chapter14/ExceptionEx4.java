package chapter14;

import java.io.IOException;
import java.sql.SQLException;

public class ExceptionEx4 {
	public void doJob() throws JobException{
		
		try {
			init();
			System.out.println("실제 작업 내용입니다.");
			finish();	
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			throw new JobException(e.getMessage());
		}
	}
	
	private void init() throws SQLException{
		System.out.println("파일을 열기 시작합니다.");
	}
	
	private void finish() throws IOException{
		System.out.println("연결된 파일을 닫고 종료합니다.");
	}
}

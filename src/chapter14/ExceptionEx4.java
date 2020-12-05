package chapter14;

import java.io.IOException;
import java.sql.SQLException;

public class ExceptionEx4 {
	public void doJob() throws JobException{
		
		try {
			init();
			System.out.println("���� �۾� �����Դϴ�.");
			finish();	
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			throw new JobException(e.getMessage());
		}
	}
	
	private void init() throws SQLException{
		System.out.println("������ ���� �����մϴ�.");
	}
	
	private void finish() throws IOException{
		System.out.println("����� ������ �ݰ� �����մϴ�.");
	}
}

package chapter15;

import java.io.File;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

public class ExcelMaker {
	public static void main(String[] args) throws Exception{
		WritableWorkbook workbook = Workbook.createWorkbook(new File("data.xls"));
		//sheet만들기
		WritableSheet s1 = workbook.createSheet("Sheet 0", 0);
		WritableSheet s2 = workbook.createSheet("Sheet 1", 1);
		WritableSheet s3 = workbook.createSheet("Sheet 2", 2);
		//cell 만들기
		for (int i = 0; i < 100; i++) {
			Label label = new Label(0, i, "데이터...." + i);
			s1.addCell(label);
		}
		workbook.write();
		workbook.close();
	}
}

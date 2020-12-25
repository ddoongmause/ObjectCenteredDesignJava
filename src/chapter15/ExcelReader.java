package chapter15;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ExcelReader {
	public static void main(String[] args) throws BiffException, IOException {
		Workbook wb = Workbook.getWorkbook(new File("data.xls"));
		Sheet sheet = wb.getSheet(0);

		int i = 0;
		while (true) {
			try {
				Cell cell = sheet.getCell(0, i);
				i++;
				System.out.println(cell.getContents());
			} catch (Exception e) {
				break;
			}
		}
	}
}

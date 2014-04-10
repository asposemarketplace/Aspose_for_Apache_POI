package excel.hideunhidecells;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ApacheHideUnHideCells
{
	public static void main(String[] args) throws Exception
	{
		InputStream inStream = new FileInputStream("data/workbook.xls");
		Workbook workbook = WorkbookFactory.create(inStream);
		Sheet sheet = workbook.createSheet();
		Row row = sheet.createRow(0);
		row.setZeroHeight(true);
		
		FileOutputStream fileOut = new FileOutputStream("data/hideUnhideCells_Apache.xls");
		workbook.write(fileOut);
		fileOut.close();
	}
}

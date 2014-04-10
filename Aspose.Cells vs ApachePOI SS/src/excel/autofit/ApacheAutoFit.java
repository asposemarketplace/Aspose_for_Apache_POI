package excel.autofit;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ApacheAutoFit
{
	public static void main(String[] args) throws Exception
	{
		InputStream inStream = new FileInputStream("data/workbook.xls");
		Workbook workbook = WorkbookFactory.create(inStream);
		
		Sheet sheet = workbook.createSheet("new sheet");
		sheet.autoSizeColumn(0); //adjust width of the first column
		sheet.autoSizeColumn(1); //adjust width of the second column
		
		FileOutputStream fileOut;
		fileOut = new FileOutputStream("data/AutoFit_Apache.xls");
		workbook.write(fileOut);
		fileOut.close();
	}
}
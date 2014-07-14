package excel.newworkbook;

import java.io.FileOutputStream;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;

public class ApachePOINewWorkbook
{
	public static void main(String[] args) throws Exception
	{
		Workbook wb = new HSSFWorkbook();

		FileOutputStream fileOut;
		fileOut = new FileOutputStream("data/newWorkBook_Apache.xls");
		wb.write(fileOut);
		fileOut.close();

		System.out.println("File Created.");
	}
}
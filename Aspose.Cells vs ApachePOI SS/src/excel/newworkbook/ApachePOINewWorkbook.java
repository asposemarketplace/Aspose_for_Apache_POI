package excel.newworkbook;

import java.io.FileOutputStream;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;

public class ApachePOINewWorkbook
{
	public void createNewWorkbook() throws Exception
	{
		Workbook wb = new HSSFWorkbook();

		FileOutputStream fileOut;
		fileOut = new FileOutputStream("newWorkBook.xls");
		wb.write(fileOut);
		fileOut.close();

		System.out.println("File Created.");
	}
	// =======================================================
	public static void main(String[] args) throws Exception
	{
		new ApachePOINewWorkbook().createNewWorkbook();
	}
}
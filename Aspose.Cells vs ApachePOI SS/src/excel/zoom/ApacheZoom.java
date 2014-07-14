package excel.zoom;

import java.io.FileOutputStream;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class ApacheZoom
{
	public static void main(String[] args) throws Exception
	{
		Workbook wb = new HSSFWorkbook();
	    Sheet sheet1 = wb.createSheet("new sheet");
	    sheet1.setZoom(3,4);   // 75 percent magnification
	    
	    // Write the output to a file
	    FileOutputStream fileOut = new FileOutputStream("data/ApacheZoom.xls");
	    wb.write(fileOut);
	    fileOut.close();	

	}
}

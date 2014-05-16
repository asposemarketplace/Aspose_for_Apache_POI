package excel.copyandmove;

import com.aspose.cells.Workbook;
import com.aspose.cells.WorksheetCollection;

public class AsposeCopySheetWithinWorkbook
{
	public static void main(String[] args) throws Exception
	{
		//Create a new Workbook by excel file path
		Workbook wb = new Workbook("data/workbook.xls");
		
		//Create a Worksheets object with reference to the sheets of the Workbook.
		WorksheetCollection sheets = wb.getWorksheets();
		
		//Copy data to a new sheet from an existing
		//sheet within the Workbook.
		sheets.addCopy("Sheet1");
		
		//Save the excel file.
		wb.save("data/AsposeCopyWorkbook.xls");
		
		System.out.println("Sheet copied successfully."); // Print Message
	}
}

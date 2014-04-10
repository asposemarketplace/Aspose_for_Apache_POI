package excel.newworksheet;

import com.aspose.cells.Workbook;
import com.aspose.cells.Worksheet;
import com.aspose.cells.WorksheetCollection;

public class AsposeNewWorksheet
{
	private void createNewWorksheet() throws Exception
	{
        //Instantiating a Workbook object
        Workbook workbook = new Workbook();

        //Adding a new worksheet to the Workbook object
        WorksheetCollection worksheets = workbook.getWorksheets();
        Worksheet worksheet = worksheets.add("My Worksheet");

        //Saving the Excel file
        workbook.save("data/newWorksheet_Aspose.xls");
        
        //Print Message
        System.out.println("Sheet added successfully.");
	}
	
	public static void main(String[] args) throws Exception
	{
		new AsposeNewWorksheet().createNewWorksheet();
	}
}

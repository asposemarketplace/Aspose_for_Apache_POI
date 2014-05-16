package excel.newworkbook;

import com.aspose.cells.FileFormatType;
import com.aspose.cells.Workbook;

public class AsposeNewWorkbook
{
	public void createNewWorkbook() throws Exception
	{
		Workbook workbook = new Workbook(); // Creating a Workbook object

		//Workbooks can be saved in many formats
		workbook.save("data/newWorkBook.xlsx", FileFormatType.XLSX);
	
		System.out.println("Worksheets are saved successfully."); // Print Message
	}
	//=======================================================
	public static void main(String[] args) throws Exception
	{
		new AsposeNewWorkbook().createNewWorkbook();
	}
}
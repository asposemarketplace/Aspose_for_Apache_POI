package excel.newworkbook;

import com.aspose.cells.FileFormatType;
import com.aspose.cells.Workbook;

public class AsposeNewWorkbook
{
	public static void main(String[] args) throws Exception
	{
		Workbook workbook = new Workbook(); // Creating a Workbook object

		//Workbooks can be saved in many formats
		workbook.save("data/newWorkBook_Aspose.xlsx", FileFormatType.XLSX);

		System.out.println("Worksheets are saved successfully."); // Print Message
	}
}
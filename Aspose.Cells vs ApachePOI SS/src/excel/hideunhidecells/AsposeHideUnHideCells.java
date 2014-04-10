package excel.hideunhidecells;

import com.aspose.cells.Cells;
import com.aspose.cells.Workbook;
import com.aspose.cells.Worksheet;

public class AsposeHideUnHideCells
{
	public static void main(String[] args) throws Exception
	{
		Workbook workbook = new Workbook("data/workbook.xls");
		
		//Accessing the first worksheet in the Excel file
		Worksheet worksheet = workbook.getWorksheets().get(0);
		Cells cells = worksheet.getCells();
		
		cells.hideRow(2); //Hiding the 3rd row of the worksheet
		cells.hideColumn(1); //Hiding the 2nd column of the worksheet
		
		//Saving the modified Excel file in default (that is Excel 2003) format
		workbook.save("data/hideUnhideCells_Aspose.xls");

        //Print message
        System.out.println("Rows and Columns hidden successfully.");           

	}
}

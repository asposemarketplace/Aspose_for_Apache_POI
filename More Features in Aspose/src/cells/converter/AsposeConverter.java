package cells.converter;

import com.aspose.cells.SaveFormat;
import com.aspose.cells.Workbook;

public class AsposeConverter
{
	public static void main(String[] args) throws Exception
	{
		Workbook workbook = new Workbook("data/workbook.xls");
		
		//Save the document in PDF format
		workbook.save("data/AsposeConvert.pdf", SaveFormat.PDF);

        // Print message
        System.out.println("Excel to PDF conversion performed successfully.");
	}
}

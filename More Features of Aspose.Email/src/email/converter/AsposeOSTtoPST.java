package email.converter;

import com.aspose.email.FileFormat;
import com.aspose.email.PersonalStorage;

public class AsposeOSTtoPST
{
	public static void main(String[] args)
	{
		PersonalStorage ost = PersonalStorage.fromFile("data/outlook.ost");

		ost.saveAs("data/AsposeOST-PST.pst", FileFormat.Pst);
		System.out.println("Done");
	}
}

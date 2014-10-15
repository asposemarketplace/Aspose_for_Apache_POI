package slides.security;

import com.aspose.slides.Presentation;

public class AsposeApplyPasswordProtection
{
	public static void main(String[] args)
	{
		//Instantiate a Presentation object that represents a PPT file
		Presentation pres = new Presentation();

		//....do some work here.....

		//Setting Password
		pres.getProtectionManager().encrypt("pass");

		//Save your presentation to a file
		pres.save("data/AsposeProtection.pptx", com.aspose.slides.SaveFormat.Pptx);
	    
	    //Printing the status
	    System.out.println("Protection Applied successfully!");
	}
}

package slides.createpresentation;

import com.aspose.slides.Presentation;
import com.aspose.slides.Slide;

public class AsposeCreatePresentation
{
	public static void main(String[] args)
	{
		//Instantiate a Presentation object that represents a PPT file
        Presentation pres = new Presentation();

        //Writing the presentation as a PPT file
        pres.write("data/NewPPT_Aspose.ppt");

        //Printing the status
        System.out.println("Slides added successfully!");
	}
}

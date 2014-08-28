package slides.workingwithpresentation;

import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.Slide;

public class AsposeCreatePresentation
{
	public static void main(String[] args)
	{
		double startTime = System.nanoTime();

		//Instantiate a Presentation object that represents a PPT file
		Presentation pres = new Presentation();
		//Writing the presentation as a PPT file
		pres.save("data/NewPPT_Aspose.ppt", SaveFormat.Ppt);

		//Printing the status
        System.out.println("Aspose Slides added successfully!");
	}
}

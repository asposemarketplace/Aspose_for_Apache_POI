package slides.workingwithpresentation;

import java.io.FileOutputStream;

import org.apache.poi.hslf.model.Slide;
import org.apache.poi.hslf.usermodel.SlideShow;

public class ApacheCreatePresentation
{
	public static void main(String[] args) throws Exception
	{
		double startTime = System.nanoTime();

		//create a new empty slide show
		SlideShow ppt = new SlideShow();
		//add first slide
		Slide s1 = ppt.createSlide();
		//save changes in a file
		FileOutputStream out = new FileOutputStream("data/NewPPT_Apache.ppt");
		ppt.write(out);
		out.close();

		//Printing the status
        System.out.println("Aspose Slides added successfully!");
	}
}

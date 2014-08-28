package slides.workingwithpresentation;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xslf.usermodel.XMLSlideShow;
import org.apache.poi.xslf.usermodel.XSLFSlide;

public class ApacheOpenandSave
{
	public static void main(String[] args) throws Exception
	{
		XMLSlideShow ppt = new XMLSlideShow(new FileInputStream("data/presentation.pptx"));

	    //append a new slide to the end
	    XSLFSlide blankSlide = ppt.createSlide();
	    
		//save changes in a file
		FileOutputStream out = new FileOutputStream("data/EditedPPT_Apache.pptx");
		ppt.write(out);
		out.close();

		System.out.println("Presentation Edited and Saved.");
	}
}

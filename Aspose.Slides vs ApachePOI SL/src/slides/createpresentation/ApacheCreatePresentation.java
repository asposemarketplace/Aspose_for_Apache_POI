package slides.createpresentation;

import java.io.FileOutputStream;

import org.apache.poi.hslf.model.Slide;
import org.apache.poi.hslf.usermodel.SlideShow;

public class ApacheCreatePresentation
{
	public static void main(String[] args) throws Exception
	{
		//create a new empty slide show
	    SlideShow ppt = new SlideShow();

	    //add first slide
	    Slide s1 = ppt.createSlide();

	    //save changes in a file
	    FileOutputStream out = new FileOutputStream("data/NewPPT_Apache.ppt");
	    ppt.write(out);
	    out.close();
	}
}

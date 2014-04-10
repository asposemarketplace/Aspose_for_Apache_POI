package slides.addslides;

import java.io.FileOutputStream;

import org.apache.poi.hslf.model.Slide;
import org.apache.poi.hslf.usermodel.SlideShow;

public class ApacheAddSlides
{
	public static void main(String[] args) throws Exception
	{
		//create a new empty slide show
	    SlideShow ppt = new SlideShow();

	    //add first slide
	    Slide s1 = ppt.createSlide();

	    //add second slide
	    Slide s2 = ppt.createSlide();
	    
	    //save changes in a file
	    FileOutputStream out = new FileOutputStream("data/AddSlides_Apache.ppt");
	    ppt.write(out);
	    out.close();
	}
}

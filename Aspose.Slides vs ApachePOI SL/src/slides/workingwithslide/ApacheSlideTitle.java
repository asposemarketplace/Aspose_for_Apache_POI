package slides.workingwithslide;

import java.io.FileOutputStream;

import org.apache.poi.hslf.model.Slide;
import org.apache.poi.hslf.model.TextBox;
import org.apache.poi.hslf.usermodel.SlideShow;

public class ApacheSlideTitle
{
	public static void main(String[] args) throws Exception
	{
		SlideShow ppt = new SlideShow();
	    Slide slide = ppt.createSlide();
	    TextBox title = slide.addTitle();
	    title.setText("Hello, World!");
	    
	    //save changes 
	    FileOutputStream out = new FileOutputStream("data/Apache_SlideTitle.ppt");
	    ppt.write(out);
	    out.close();
	    
		System.out.println("Presentation with Title Saved.");
	}
}
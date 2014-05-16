package slides.move;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xslf.usermodel.XMLSlideShow;
import org.apache.poi.xslf.usermodel.XSLFSlide;

public class ApacheMoveSlides
{
	public static void main(String[] args) throws Exception
	{
		XMLSlideShow ppt = new XMLSlideShow(new FileInputStream("data/presentation.pptx"));

		//add slides
	    ppt.createSlide();
	    ppt.createSlide();
	    ppt.createSlide();

	    XSLFSlide[] slides = ppt.getSlides();
	    ppt.setSlideOrder(slides[0], 4); 
	    
	    //save changes in a file
	    FileOutputStream out = new FileOutputStream("data/Apache_ReOrdered_Slides.pptx");
	    ppt.write(out);
	    out.close();
	    
		System.out.println("Slides ReOrdered Successfuly.");
	}
}

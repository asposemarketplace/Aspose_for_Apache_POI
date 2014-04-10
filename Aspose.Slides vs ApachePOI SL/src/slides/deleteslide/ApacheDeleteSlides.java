package slides.deleteslide;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xslf.usermodel.XMLSlideShow;

public class ApacheDeleteSlides
{
	public static void main(String[] args)throws Exception
	{
		XMLSlideShow ppt = new XMLSlideShow(new FileInputStream("data/presentation.pptx"));
		
		ppt.removeSlide(0); // 0-based index of a slide to be removed
		
		FileOutputStream out = new FileOutputStream("data/DeleteSlide_Apache.ppt");
		ppt.write(out);
		out.close();
	}
}

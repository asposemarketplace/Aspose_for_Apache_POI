package slides.count;

import java.io.FileInputStream;
import org.apache.poi.hslf.usermodel.SlideShow;

public class ApacheCountSlides
{
	public static void main(String[] args) throws Exception
	{
		SlideShow ppt = new SlideShow(new FileInputStream("data/presentation.ppt"));
		System.out.println("Total Slides in Count: " + ppt.getSlides().length);
	}
}

package slides.addslides;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xslf.usermodel.SlideLayout;
import org.apache.poi.xslf.usermodel.XMLSlideShow;
import org.apache.poi.xslf.usermodel.XSLFSlide;
import org.apache.poi.xslf.usermodel.XSLFSlideLayout;
import org.apache.poi.xslf.usermodel.XSLFSlideMaster;

public class ApacheAddLayoutSlides
{
	public static void main(String[] args) throws Exception
	{
		XMLSlideShow ppt = new XMLSlideShow(new FileInputStream("data/presentation.pptx"));

	    // blank slide
	    ppt.createSlide();

	    // there can be multiple masters each referencing a number of layouts
	    // for demonstration purposes we use the first (default) slide master
	    XSLFSlideMaster defaultMaster = ppt.getSlideMasters()[0];

	    // title slide
	    XSLFSlideLayout titleLayout = defaultMaster.getLayout(SlideLayout.TITLE);
	    // fill the placeholders
	    XSLFSlide slide1 = ppt.createSlide(titleLayout);

	    // title and content
	    XSLFSlideLayout titleBodyLayout = defaultMaster.getLayout(SlideLayout.TITLE_AND_CONTENT);
	    XSLFSlide slide2 = ppt.createSlide(titleBodyLayout);

	    FileOutputStream out = new FileOutputStream("data/Apache_Layouts.pptx");
		ppt.write(out);
		out.close();
		
		System.out.println("Layout slides created Successfuly.");
	}
}
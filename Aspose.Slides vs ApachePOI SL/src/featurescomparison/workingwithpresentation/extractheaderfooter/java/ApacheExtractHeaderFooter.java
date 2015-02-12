package featurescomparison.workingwithpresentation.extractheaderfooter.java;

import java.io.FileInputStream;

import org.apache.poi.hslf.model.HeadersFooters;
import org.apache.poi.hslf.model.Slide;
import org.apache.poi.hslf.usermodel.SlideShow;

public class ApacheExtractHeaderFooter
{
	public static void main(String[] args) throws Exception
	{
		String dataPath = "src/featurescomparison/workingwithpresentation/extractheaderfooter/data/";
		
		 FileInputStream is = new FileInputStream(dataPath + "ApacheHeaderFooter.ppt");
         SlideShow ppt = new SlideShow(is);
         is.close();
         Slide[] slides = ppt.getSlides();

         //presentation-scope headers / footers
         HeadersFooters hdd = ppt.getSlideHeadersFooters();
         if(hdd.isFooterVisible()) {
             String footerText = hdd.getFooterText();
         }

         //per-slide headers / footers
         for (int i=0; i < slides.length; i++){
             HeadersFooters hdd2 = slides[i].getHeadersFooters();
             if(hdd2.isFooterVisible()) {
                 String footerText = hdd2.getFooterText();
                 System.out.println(footerText + footerText);
             }
             if(hdd2.isUserDateVisible()) {
                String customDate = hdd2.getDateTimeText();
                System.out.println(customDate + customDate);
             }
             if(hdd2.isSlideNumberVisible()){
                 int slideNUm = slides[i].getSlideNumber();
                 System.out.println(slideNUm + slideNUm);
             }

         }
	  
        System.out.println("Done...");
	}
}
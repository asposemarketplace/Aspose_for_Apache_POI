package featurescomparison.workingwithpresentation.createheaderfooter.java;

import java.io.FileOutputStream;

import org.apache.poi.hslf.model.HeadersFooters;
import org.apache.poi.hslf.usermodel.SlideShow;

public class ApacheCreateHeaderFooter
{
	public static void main(String[] args) throws Exception
	{
		String dataPath = "src/featurescomparison/workingwithpresentation/createheaderfooter/data/";
		
		SlideShow ppt = new SlideShow();

		ppt.createSlide();

		//presentation-scope headers / footers
        HeadersFooters hf = ppt.getSlideHeadersFooters();
        hf.setSlideNumberVisible(true);
        hf.setFootersText("Created by POI-HSLF");
        
        FileOutputStream out = new FileOutputStream(dataPath + "ApacheHeaderFooter.ppt");
        ppt.write(out);
        out.close();
	  
        System.out.println("Done...");
	}
}
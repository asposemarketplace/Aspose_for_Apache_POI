package featurescomparison.workingwithpresentation.extractheaderfooter.java;

import com.aspose.slides.Presentation;

public class AsposeExtractHeaderFooter
{
	public static void main(String[] args)
	{
		String dataPath = "src/featurescomparison/workingwithpresentation/extractheaderfooter/data/";
		
		// Instantiate a PresentationEx object that represents a PPTX file
		Presentation sourcePres = new Presentation(dataPath + "AsposeHeaderFooter.pptx");
	    
		System.out.println(sourcePres.getHeaderFooterManager().isDateTimeVisible());
		System.out.println(sourcePres.getHeaderFooterManager().isFooterVisible());
		System.out.println(sourcePres.getHeaderFooterManager().isSlideNumberVisible());

		sourcePres.getHeaderFooterManager().setDateTimeVisible(false);
		sourcePres.getHeaderFooterManager().setFooterVisible(false);
		sourcePres.getHeaderFooterManager().setSlideNumberVisible(false);
		
		System.out.println(sourcePres.getHeaderFooterManager().isDateTimeVisible());
		System.out.println(sourcePres.getHeaderFooterManager().isFooterVisible());
		System.out.println(sourcePres.getHeaderFooterManager().isSlideNumberVisible());

	    System.out.println("Done...");
	}
}
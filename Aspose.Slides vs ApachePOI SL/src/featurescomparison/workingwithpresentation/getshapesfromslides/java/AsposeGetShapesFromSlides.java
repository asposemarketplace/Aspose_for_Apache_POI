package featurescomparison.workingwithpresentation.getshapesfromslides.java;

import com.aspose.slides.IShapeCollection;
import com.aspose.slides.ISlide;
import com.aspose.slides.Presentation;

public class AsposeGetShapesFromSlides
{
	public static void main(String[] args)
	{
		String dataPath = "src/featurescomparison/workingwithpresentation/getshapesfromslides/data/";
		
		// Instantiate a PresentationEx object that represents a PPTX file
		Presentation pres = new Presentation(dataPath + "AutoShapes.pptx");
		
		ISlide slide =  pres.getSlides().get_Item(0);
		
		//Accessing source slide shape collection
		IShapeCollection sourceShapes = slide.getShapes();

		//Iterating through all shapes inside the slide
	    for (int i = 0; i < sourceShapes.size(); i++)
	    {
	    	System.out.println(sourceShapes.get_Item(i).getWidth() +  " x " + 
	    			sourceShapes.get_Item(i).getHeight());
	    }
	    System.out.println("Done...");
	}
}
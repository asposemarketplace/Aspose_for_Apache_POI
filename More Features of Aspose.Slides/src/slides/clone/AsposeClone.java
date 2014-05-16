package slides.clone;

import com.aspose.slides.PresentationEx;
import com.aspose.slides.SlideExCollection;

public class AsposeClone
{
	public static void main(String[] args)
	{
		//Instantiate PresentationEx class that represents a PPTX file
		PresentationEx pres = new PresentationEx("data/presentation.pptx");
		
		//Clone the desired slide to the end of the collection of slides in the same PPTX
		SlideExCollection slds = pres.getSlides();
		slds.addClone(pres.getSlides().get_Item(0));
		
		//Write the modified pptx to disk
		pres.write("data/AsposeClone.pptx");

        //Printing the status
        System.out.println("Slide cloned successfully!");
	}
}

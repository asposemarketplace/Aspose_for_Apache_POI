package slides.deleteslide;

import com.aspose.slides.PresentationEx;
import com.aspose.slides.SlideEx;

public class AsposeDeleteSlides
{
	public static void main(String[] args)
	{
		//Instantiate a PresentationEx object that represents a PPTX file
		PresentationEx pres = new PresentationEx("data/presentation.pptx");
		pres.getSlides().removeAt(1); //Removing a slide using its index
		
		//===========================================================
		//Accessing a slide using its index in the slides collection
		SlideEx slide = pres.getSlides().get_Item(0);
		pres.getSlides().remove(slide); //Removing a slide using its reference

        //Writing the presentation as a PPTX file
        pres.write("data/DeleteSlides_Aspose.pptx");

        //Printing the status
        System.out.println("Slide removed successfully!");
	}
}

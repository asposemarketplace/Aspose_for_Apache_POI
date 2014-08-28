package slides.deleteslide;

import com.aspose.slides.ISlide;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;

public class AsposeDeleteSlides
{
	public static void main(String[] args)
	{
		//Instantiate a PresentationEx object that represents a PPTX file
		Presentation pres = new Presentation("data/presentation.pptx");

		pres.getSlides().removeAt(1); //Removing a slide using its index

		//===========================================================
		//Accessing a slide using its index in the slides collection
		ISlide slide = pres.getSlides().get_Item(0);
		pres.getSlides().remove(slide); //Removing a slide using its reference

        //Writing the presentation as a PPTX file
        pres.save("data/DeleteSlides_Aspose.pptx", SaveFormat.Pptx);

        //Printing the status
        System.out.println("Slide removed successfully!");
	}
}

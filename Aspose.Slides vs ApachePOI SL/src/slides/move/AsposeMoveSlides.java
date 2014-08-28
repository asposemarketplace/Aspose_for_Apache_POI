package slides.move;

import com.aspose.slides.ISlide;
import com.aspose.slides.ISlideCollection;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.Slide;

public class AsposeMoveSlides
{
	public static void main(String[] args)
	{
		//Instantiate a Presentation object that represents a PPT file
		Presentation pres = new Presentation("data/presentation.ppt");
				
		//Accessing a slide using its slide position
		ISlide slide = pres.getSlides().get_Item(0);
		
		//Change the position of the selected slide
		slide.setSlideNumber(2);

		//Writing the presentation as a PPT file
		pres.save("data/Aspose_ReOrdered_Slides.ppt", SaveFormat.Ppt);
		System.out.println("Slides ReOrdered Successfuly.");
	}
}

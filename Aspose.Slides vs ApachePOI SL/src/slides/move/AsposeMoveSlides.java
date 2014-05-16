package slides.move;

import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.Slide;

public class AsposeMoveSlides
{
	public static void main(String[] args)
	{
		//Instantiate a Presentation object that represents a PPT file
		Presentation pres = new Presentation("data/presentation.ppt");
		pres.addBodySlide();
		pres.addDoubleBodySlide();
		pres.addEmptySlide();
		pres.addHeaderSlide();
		pres.addTitleSlide();
		//Accessing a slide using its slide position
		Slide slide = pres.getSlideByPosition(1);

		//Change the position of the selected slide
		slide.setSlidePosition(5);

		//Writing the presentation as a PPT file
		pres.write("data/Aspose_ReOrdered_Slides.ppt");
		System.out.println("Slides ReOrdered Successfuly.");
	}
}

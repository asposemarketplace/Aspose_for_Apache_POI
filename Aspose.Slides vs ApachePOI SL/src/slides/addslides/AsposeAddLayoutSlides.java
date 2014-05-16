package slides.addslides;

import com.aspose.slides.Presentation;

public class AsposeAddLayoutSlides
{
	public static void main(String[] args)
	{
		//Instantiate a Presentation object that represents a PPT file
		Presentation pres = new Presentation("data/presentation.ppt");
		
		// Body Slide
		pres.addBodySlide();
		pres.addDoubleBodySlide();
		pres.addEmptySlide();
		pres.addHeaderSlide();
		pres.addTitleSlide();

		//Writing the presentation as a PPT file
		pres.write("data/Aspose_Layouts.ppt");
		System.out.println("Layout slides created Successfuly.");

	}
}

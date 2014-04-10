package slides.addslides;

import com.aspose.slides.Presentation;
import com.aspose.slides.Slide;

public class AsposeAddSlides
{
	public static void main(String[] args)
	{
        //Instantiate a Presentation object that represents a PPT file
        Presentation pres = new Presentation();

        //Adding an empty slide to the presentation and getting the reference of that empty slide
        Slide slide1 = pres.addEmptySlide();

        //Adding a body slide to the presentation and getting the reference of that body slide
        Slide slide2 = pres.addBodySlide();

        //Adding a double body slide to the presentation and getting the reference of that double body slide
        Slide slide3 = pres.addDoubleBodySlide();

        //Adding a header slide to the presentation and getting the reference of that header slide
        Slide slide4 = pres.addHeaderSlide();

        //Adding a title slide to the presentation and getting the reference of that title slide
        Slide slide5 = pres.addTitleSlide();

        //Writing the presentation as a PPT file
        pres.write("data/AddSlides_Aspose.ppt");

        //Printing the status
        System.out.println("Slides added successfully!");
	}
}

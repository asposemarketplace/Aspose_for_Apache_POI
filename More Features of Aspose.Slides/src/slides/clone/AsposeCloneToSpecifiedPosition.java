package slides.clone;

import com.aspose.slides.ISlideCollection;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;

public class AsposeCloneToSpecifiedPosition
{
	public static void main(String[] args)
	{
		//Instantiate Presentation class that represents a presentation file
		Presentation pres = new Presentation("data/presentation.pptx");

		//Clone the desired slide to the end of the collection of slides in the same presentation
		ISlideCollection slds = pres.getSlides();

		//Clone the desired slide to the specified index in the same presentation
		slds.insertClone(2, pres.getSlides().get_Item(1));

		//Write the modified presentation to disk
		pres.save("data/AsposeCloneToPosition.pptx", SaveFormat.Pptx);
	}
}

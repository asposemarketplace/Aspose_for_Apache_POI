package slides.text;

import com.aspose.slides.AutoShapeEx;
import com.aspose.slides.PresentationEx;
import com.aspose.slides.ShapeEx;
import com.aspose.slides.SlideEx;

public class AsposeReplaceTxtInPlaceHolders
{
	public static void main(String[] args)
	{
		//Instantiate PresentationEx class that represents PPTX
		PresentationEx pres = new PresentationEx("data/demo.pptx");
		
		//Access first slide
		SlideEx slide = pres.getSlides().get_Item(0);
		
		ShapeEx shape= null;
		
		//Iterate through the shapes and set a reference to the table found
		for (int i = 0 ; i < slide.getShapes().getCount() ; i++)
		{
		    shape = slide.getShapes().get_Item(i);
		    if (shape.getPlaceholder()!=null)
		    {
		        //Change the text of each placeholder
		        ((AutoShapeEx)shape).getTextFrame().setText("This is Placeholder");
		    }
		}
		
		//Write the PPTX to Disk
		pres.write("data/AsposeReplaceTxt.pptx");

        // Status
        System.out.println("Process completed successfully.");
	}
}

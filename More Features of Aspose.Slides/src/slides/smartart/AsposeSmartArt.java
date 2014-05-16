package slides.smartart;

import com.aspose.slides.PresentationEx;
import com.aspose.slides.ShapeEx;
import com.aspose.slides.SlideEx;
import com.aspose.slides.SmartArtEx;
import com.aspose.slides.SmartArtLayoutTypeEx;

public class AsposeSmartArt
{
	public static void main(String[] args)
	{
		//Instantiate the presentation
		PresentationEx pres = new PresentationEx();
		        
		//Access the presentation slide
		SlideEx slide = pres.getSlides().get_Item(0);
		        
		//Add Smart Art Shape
		SmartArtEx smart = slide.getShapes().addSmartArt(0, 0, 400, 400, SmartArtLayoutTypeEx.BasicBlockList);

		//Saving presentation
		pres.save("data/AsposeSmartArt.pptx",com.aspose.slides.SaveFormat.Pptx);
		
		//Load the desired the presentation
		//pres = new PresentationEx("data/AsposeSmartArt.pptx");

		//Traverse through every shape inside first slide
		for (ShapeEx shape : pres.getSlides().get_Item(0).getShapes())
		{
		    //Check if shape is of SmartArt type
		    if (shape instanceof SmartArtEx)
		    {
		        //Typecast shape to SmartArtEx
				System.out.println("Shape Found");
				SmartArtEx smartArt = (SmartArtEx) shape;
		    }
		}
		System.out.println("Smart Art added and Accessed.");
	}
}

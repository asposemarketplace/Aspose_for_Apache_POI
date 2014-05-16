package slides.thumbnail;

import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

import com.aspose.slides.PresentationEx;
import com.aspose.slides.SlideEx;

public class AsposeThumbnail
{
	public static void main(String[] args) throws Exception
	{
		//Instantiate a PresentationEx class that represents the PPTX file
		PresentationEx pres = new PresentationEx("data/presentation.pptx");
		
		//Access the first slide
		SlideEx sld = pres.getSlides().get_Item(0);
		
		//Create a full scale image
		BufferedImage image = sld.getThumbnail(1f, 1f);
		
		//Save the image to disk in JPEG format
		ImageIO.write(image,"jpeg",new File("data/AsposeThumbnail.jpg"));

        //Printing the status
        System.out.println("Thumbnail created successfully!");
	}
}

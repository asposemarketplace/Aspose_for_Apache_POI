package slides.background;

import java.io.File;
import java.io.FileInputStream;

import com.aspose.slides.BackgroundType;
import com.aspose.slides.FillType;
import com.aspose.slides.IPPImage;
import com.aspose.slides.PictureFillMode;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;

public class AsposeAddBackground
{
	public static void  main(String[] args) throws Exception
	{
		//Instantiate the Presentation class that represents the presentation file
		Presentation pres = new Presentation();

		//Set the background with Image
		pres.getSlides().get_Item(0).getBackground().setType (BackgroundType.OwnBackground);
		pres.getSlides().get_Item(0).getBackground().getFillFormat().setFillType ( FillType.Picture);
		pres.getSlides().get_Item(0).getBackground().getFillFormat().getPictureFillFormat().setPictureFillMode( PictureFillMode.Stretch);

		//Set the picture
		IPPImage imgx =null;
		imgx = pres.getImages().addImage(new FileInputStream(new File("data/background.jpg")));

		//Image imgx = pres.getImages().addImage(image);
		//Add image to presentation's images collection

		pres.getSlides().get_Item(0).getBackground().getFillFormat().getPictureFillFormat().getPicture().setImage (imgx);

		//Write the presentation to disk
		pres.save("data/AsposeBG.pptx",SaveFormat.Pptx);
	}
}

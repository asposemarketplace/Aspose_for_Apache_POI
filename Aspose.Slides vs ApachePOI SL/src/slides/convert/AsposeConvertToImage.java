package slides.convert;

import java.awt.Dimension;

import com.aspose.slides.PresentationEx;

public class AsposeConvertToImage
{
	public static void main(String[] args) throws Exception
	{
		//Instantiate a PresentationEx object that represents a PPTX file
		PresentationEx pres = new PresentationEx("data/presentation.pptx");

		//Instantiate the TiffOptions class
		com.aspose.slides.TiffOptions opts = new com.aspose.slides.TiffOptions();

		//Set Image Size
		opts.setImageSize(new Dimension(500, 400));

		//Save the prsentation to TIFF with specified image size
		pres.save("data/Aspose_PPT-TIFF.tiff", com.aspose.slides.SaveFormat.Tiff,opts);
		
		System.out.println("Slide Converted to Image Successfully");
	}
}

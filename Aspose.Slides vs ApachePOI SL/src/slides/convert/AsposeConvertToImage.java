package slides.convert;

import java.awt.Dimension;

import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.TiffOptions;

public class AsposeConvertToImage
{
	public static void main(String[] args) throws Exception
	{
		//Instantiate a PresentationEx object that represents a PPTX file
		Presentation pres = new Presentation("data/presentation.pptx");
		
		//Instantiate the TiffOptions class
		TiffOptions opts = new TiffOptions();
		
		//Set Image Size
		opts.setImageSize(new Dimension(500, 400));
		
		//Save the prsentation to TIFF with specified image size
		pres.save("data/Aspose_PPT-TIFF.tiff", SaveFormat.Tiff, opts);

		System.out.println("Slide Converted to Image Successfully");
	}
}

package slides.count;

import com.aspose.slides.PresentationEx;

public class AsposeCountSlides
{
	public static void main(String[] args)
	{
		//Instantiate a PresentationEx object that represents a PPTX file
		PresentationEx pres = new PresentationEx("data/presentation.pptx");

		System.out.println("Total Slides in Count: " + pres.getSlides().getCount());
	}
}

package slides.convert;

import org.apache.poi.xslf.util.PPTX2PNG;

public class ApacheConvertToImage
{
	public static void main(String[] args) throws Exception
	{
		PPTX2PNG.main(new String[]{"data/presentation.pptx"});
	}
}

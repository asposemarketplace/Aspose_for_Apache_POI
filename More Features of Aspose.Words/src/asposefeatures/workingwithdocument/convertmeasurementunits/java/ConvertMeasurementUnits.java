package asposefeatures.workingwithdocument.convertmeasurementunits.java;

import com.aspose.words.ConvertUtil;
import com.aspose.words.Document;
import com.aspose.words.DocumentBuilder;
import com.aspose.words.PageSetup;

public class ConvertMeasurementUnits
{
    public static void main(String[] args) throws Exception
    {
	String dataPath = "src/asposefeatures/workingwithdocument/convertmeasurementunits/data/";
	
	Document doc = new Document();
	DocumentBuilder builder = new DocumentBuilder(doc);

	PageSetup pageSetup = builder.getPageSetup();
	pageSetup.setTopMargin(ConvertUtil.inchToPoint(1.0));
	pageSetup.setBottomMargin(ConvertUtil.inchToPoint(1.0));
	pageSetup.setLeftMargin(ConvertUtil.inchToPoint(1.5));
	pageSetup.setRightMargin(ConvertUtil.inchToPoint(1.5));
	pageSetup.setHeaderDistance(ConvertUtil.inchToPoint(0.2));
	pageSetup.setFooterDistance(ConvertUtil.inchToPoint(0.2));
	
	doc.save(dataPath + "AsposePageSetup.docx");
	System.out.println("Aspose Page Setup Done...");
    }
}

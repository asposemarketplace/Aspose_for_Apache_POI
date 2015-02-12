package featurescomparison.workingwithpresentation.getshapesfromslides.java;

import java.io.FileInputStream;

import org.apache.poi.xslf.usermodel.XMLSlideShow;
import org.apache.poi.xslf.usermodel.XSLFConnectorShape;
import org.apache.poi.xslf.usermodel.XSLFPictureShape;
import org.apache.poi.xslf.usermodel.XSLFShape;
import org.apache.poi.xslf.usermodel.XSLFSlide;
import org.apache.poi.xslf.usermodel.XSLFTextShape;

public class ApacheGetShapesFromSlides
{
	public static void main(String[] args) throws Exception
	{
		String dataPath = "src/featurescomparison/workingwithpresentation/getshapesfromslides/data/";
		
		XMLSlideShow ppt = new XMLSlideShow(new FileInputStream(dataPath + "AutoShapes.pptx"));
		  //get slides 
		  XSLFSlide[] slide = ppt.getSlides();
		  for (int i = 0; i < slide.length; i++){
		    XSLFShape[] sh = slide[i].getShapes();
		    for (int j = 0; j < sh.length; j++){
		      //name of the shape
		      String name = sh[j].getShapeName();

		      //shapes's anchor which defines the position of this shape in the slide
		      java.awt.geom.Rectangle2D anchor = sh[j].getAnchor();

		      if (sh[j] instanceof XSLFConnectorShape){
		        XSLFConnectorShape line = (XSLFConnectorShape)sh[j];
		        System.out.println("Connector Shape.");
		        //work with Line
		      } else if (sh[j] instanceof XSLFTextShape){
		        XSLFTextShape shape = (XSLFTextShape)sh[j];
		        System.out.println("Text Shape.");
		        //work with a shape that can hold text
		      } else if (sh[j] instanceof XSLFPictureShape){
		        XSLFPictureShape shape = (XSLFPictureShape)sh[j];
		        System.out.println("Picture Shape.");
		        //work with Picture
		      }
		    }
		  }
		  System.out.println("Done...");
	}
}

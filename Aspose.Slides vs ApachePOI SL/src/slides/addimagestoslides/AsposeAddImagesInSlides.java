package slides.addimagestoslides;

import java.awt.Color;
import java.awt.Point;

import com.aspose.slides.FillType;
import com.aspose.slides.GradientColorType;
import com.aspose.slides.LineArrowheadStyle;
import com.aspose.slides.LineDashStyle;
import com.aspose.slides.LineStyle;
import com.aspose.slides.PatternStyle;
import com.aspose.slides.Presentation;
import com.aspose.slides.Shape;
import com.aspose.slides.Slide;

public class AsposeAddImagesInSlides
{
	public static void main(String[] args)
	{
		//Instantiate a Presentation object that represents a PPT file
		Presentation pres = new Presentation("data/presentation.ppt");
		
		//Accessing a slide using its slide position
		Slide slide = pres.getSlideByPosition(1);
		
		//===========================================================
		// Plain Line
		//===========================================================
		//Adding a line shape into the slide with its start and end points
		slide.getShapes().addLine(new Point(1000, 2000), new Point(4700, 2000));
		 
		//===========================================================
		// Adding Simple Ellipse in the Slide
		//============================================================
		//Adding an ellipse shape into the slide by defining its X,Y postion, width and height
		slide.getShapes().addEllipse(1200, 1200, 1000, 2000);
		   
		//============================================================
		// Adding Simple Rectangle in the Slide
		//============================================================
		//Accessing a slide using its slide position
		slide = pres.getSlideByPosition(1);
		
		//Adding a rectangle shape into the slide by defining its X,Y position, width and height
		slide.getShapes().addRectangle(500, 1600, 1500, 1000);
		
		//===========================================================
		// Arrow Shaped Line
		//============================================================
		//Adding a line shape into the slide with its start and end points
		Shape shape = slide.getShapes().addLine(new Point(1000, 3000), new Point(4700, 3000));
		
		//Setting the fore color of the line to blue
		shape.getLineFormat().setForeColor(Color.blue);
		
		//Setting the width of the line to 10
		shape.getLineFormat().setWidth((byte)10);
		
		//Setting the line style to thick between thin
		shape.getLineFormat().setStyle(LineStyle.ThickBetweenThin);
		
		//Setting the dash style of the line to dash
		shape.getLineFormat().setDashStyle(LineDashStyle.Dash);
		
		//Setting the style of the starting point of the line to oval
		shape.getLineFormat().setBeginArrowheadStyle(LineArrowheadStyle.Oval);
		
		//Setting the style of the ending point of the line to open
		shape.getLineFormat().setEndArrowheadStyle(LineArrowheadStyle.Open);
		   
		//===========================================================
		// Adding Formatted Ellipse in the Slide
		//============================================================
		//Adding an ellipse shape into the slide by defining its X,Y postion, width and height
		shape = slide.getShapes().addEllipse(3000, 1200, 1000, 2000);
		
		//Setting the fill type of the ellipse to gradient
		shape.getFillFormat().setType(FillType.Gradient);
		
		//Setting the color type of the gradient to two colors
		shape.getFillFormat().setGradientColorType(GradientColorType.TwoColors);
		
		//Setting the background color of the ellipse to red
		shape.getFillFormat().setBackColor(Color.red);
		
		//Setting the foreground color of the ellipse to blue
		shape.getFillFormat().setForeColor(Color.blue);
		
		//Setting the fill angle of the gradient to 90
		shape.getFillFormat().setGradientFillAngle((byte)90);
		
		//Setting the rotation of the ellipse to 45 degrees
		shape.setRotation((byte)45);
		
		//Setting the foreground color of the ellipse lines
		shape.getLineFormat().setForeColor(Color.yellow);
		
		//============================================================
		// Adding Formatted Rectangle to Slide
		//============================================================
		//Adding a rectangle shape into the slide by defining its X,Y position, width and height
		shape = slide.getShapes().addRectangle(3500, 1600, 1500, 1000);
		
		//Setting the fill type of the rectangle to pattern
		shape.getFillFormat().setType(FillType.Pattern);
		
		//Setting the pattern style to sphere
		shape.getFillFormat().setPatternStyle(PatternStyle.Sphere);
		
		//Setting the background color of the rectangle to light gray
		shape.getFillFormat().setBackColor(Color.gray);
		
		//Setting the foreground color of the rectangle to yellow
		shape.getFillFormat().setForeColor(Color.yellow);
		
		//Setting the foreground color of the rectangle lines to blue
		shape.getLineFormat().setForeColor(Color.blue);
		
		//Setting the width of the rectangle lines in points
		shape.getLineFormat().setWidth((byte)10);
		
		//Setting the line style of the rectangle to thick thin
		shape.getLineFormat().setStyle(LineStyle.ThickThin);
		
		//Writing the presentation as a PPT file
		pres.write("data/ImageInSlides_Aspose.ppt");
        
        //Print Message
        System.out.println("Shapes added successfully.");

	}
}

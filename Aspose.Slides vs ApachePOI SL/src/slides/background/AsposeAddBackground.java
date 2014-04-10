package slides.background;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import com.aspose.slides.FillType;
import com.aspose.slides.Picture;
import com.aspose.slides.Presentation;
import com.aspose.slides.Slide;

public class AsposeAddBackground
{
	public static void main(String[] args) throws Exception
	{
        //Instantiate a Presentation object that represents a PPT file
        Presentation pres = new Presentation("data/presentation.ppt");

        //Accessing a slide using its slide position
        Slide slide = pres.getSlideByPosition(1);

        //Disable following master background settings
        slide.setFollowMasterBackground(false);

        //Setting the fill type of the background to picture
        slide.getBackground().getFillFormat().setType(FillType.Picture);

        //Creating a picture object that will be used as a slide background
        Picture pic = new Picture(pres , ImageIO.read(new File("data/background.jpg")));

        //Adding the picture object to pictures collection of the presentation
        //After the picture object is added, the picture is given a unique picture Id
        int picId = pres.getPictures().add(pic);

        //Setting the picture Id of the slide background to the Id of the picture object
        slide.getBackground().setPictureId(picId);

        //Writing the presentation as a PPT file
        pres.write("data/AddBG_Aspose.ppt");
        
        //Print Message
        System.out.println("Background set successfully.");
	}
}

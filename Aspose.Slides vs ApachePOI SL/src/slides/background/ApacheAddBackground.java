package slides.background;

import java.io.File;
import java.io.FileOutputStream;

import org.apache.poi.hslf.model.Fill;
import org.apache.poi.hslf.model.Picture;
import org.apache.poi.hslf.model.Slide;
import org.apache.poi.hslf.model.SlideMaster;
import org.apache.poi.hslf.usermodel.SlideShow;

public class ApacheAddBackground
{
	public static void main(String[] args) throws Exception
	{
		SlideShow ppt = new SlideShow();
		
		//add first slide
	    Slide s1 = ppt.createSlide();
	    
	    SlideMaster master = ppt.getSlidesMasters()[0];

	    Fill fill = master.getBackground().getFill();
	    int idx = ppt.addPicture(new File("data/background.jpg"), Picture.JPEG);
	    fill.setFillType(Fill.FILL_PICTURE);
	    fill.setPictureData(idx);
	    
	    //save changes in a file
	    FileOutputStream out = new FileOutputStream("data/AddBG_Apache.ppt");
	    ppt.write(out);
	    out.close();

	}
}

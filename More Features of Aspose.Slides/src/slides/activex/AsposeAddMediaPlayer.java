package slides.activex;

import com.aspose.slides.ControlEx;
import com.aspose.slides.ControlTypeEx;
import com.aspose.slides.PresentationEx;
import com.aspose.slides.SaveFormat;

public class AsposeAddMediaPlayer
{
	public static void main(String[] args)
	{
		//Create empty presentation instance
		PresentationEx newPptx = new PresentationEx();

		//Adding the Media Player ActiveX control
		ControlEx movieControl = newPptx.getSlides().get_Item(0).getControls().addControl(ControlTypeEx.WindowsMediaPlayer, 50, 50, 550, 300);

		//Access the Media Player ActiveX control and set the video path
		movieControl.getProperties().set_Item("URL", "C:\\Wildlife.wmv");
		      
		//Save the Presentation
		newPptx.save("data/AsposeMediaPlayer.pptx", SaveFormat.Pptx); 
		
		System.out.println("Media Player Added.");
	}
}

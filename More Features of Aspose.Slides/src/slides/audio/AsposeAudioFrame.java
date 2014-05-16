package slides.audio;

import java.io.File;
import java.io.FileInputStream;

import com.aspose.slides.Presentation;
import com.aspose.slides.Slide;

public class AsposeAudioFrame
{
	public static void main(String[] args) throws Exception
	{
		//Instantiate a Presentation object that represents a PPT file
		Presentation pres = new Presentation("data/presentation.ppt");

		//Accessing a slide using its slide position
		Slide slide = pres.getSlideByPosition(2);

		//Opening the audio file as a stream
		FileInputStream fstr = new FileInputStream(new File("C:\\logon.wav"));

		//Adding the embedded audio frame into the slide
		slide.getShapes().addAudioFrameEmbedded(2600, 1000, 500, 500, fstr);

		//Writing the presentation as a PPT file
		pres.write("data/AsposeAudio.ppt");
		
		System.out.println("Audio Control Added.");
	}
}

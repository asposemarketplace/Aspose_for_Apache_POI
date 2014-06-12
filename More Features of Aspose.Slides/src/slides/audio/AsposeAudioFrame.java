/**
 * Copyright (c) Aspose 2002-2014. All Rights Reserved.
 *
 * LICENSE: This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 3
 * of the License, or (at your option) any later version.
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://opensource.org/licenses/gpl-3.0.html>;.
 *
 * @author  Shoaib Khan <shoaib.khan@aspose.com>
 * @link    https://github.com/asposemarketplace/Aspose_for_Apache_POI
 */

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

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

package slides.transition;

import com.aspose.slides.Presentation;
import com.aspose.slides.Slide;
import com.aspose.slides.SlideTransitionEffect;
import com.aspose.slides.SlideTransitionSpeed;

public class AsposeTransitions
{
	public static void main(String[] args)
	{
		//Instantiate a Presentation object that represents a PPT file
		Presentation pres = new Presentation("data/presentation.ppt");

		//Accessing a slide using its slide position
		Slide slide = pres.getSlideByPosition(1);

		//Setting the slide transition effect to fade
		slide.getSlideShowTransition().setEntryEffect(SlideTransitionEffect.Fade);

		//Writing the presentation as a PPT file
		pres.write("data/AsposeTransition.ppt");
		
		System.out.println("First Transition File is saved.");
		
		//==============================================================
		
		//Instantiate a Presentation object that represents a PPT file
		Presentation presentation = new Presentation("data/presentation.ppt");

		//Accessing a slide using its slide position
		Slide slide1 = presentation.getSlideByPosition(1);

		//Setting the slide transition effect to fade
		slide1.getSlideShowTransition().setEntryEffect(SlideTransitionEffect.Fade);

		//Setting the speed of slide transition to slow
		slide1.getSlideShowTransition().setSpeed(SlideTransitionSpeed.Slow);

		//Setting the transition to advance on click
		slide1.getSlideShowTransition().setAdvanceOnClick(true);

		//Setting the transition to advance after a specfic time period
		slide1.getSlideShowTransition().setAdvanceOnTime(true);

		//Setting the advance time for the transition
		slide1.getSlideShowTransition().setAdvanceTime((byte)5);

		//Writing the presentation as a PPT file
		presentation.write("data/AsposeTransition2.ppt");
		
		System.out.println("Second Transition File is saved.");
	}
}

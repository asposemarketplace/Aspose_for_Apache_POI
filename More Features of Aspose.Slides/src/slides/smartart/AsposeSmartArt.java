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

package slides.smartart;

import com.aspose.slides.PresentationEx;
import com.aspose.slides.ShapeEx;
import com.aspose.slides.SlideEx;
import com.aspose.slides.SmartArtEx;
import com.aspose.slides.SmartArtLayoutTypeEx;

public class AsposeSmartArt
{
	public static void main(String[] args)
	{
		//Instantiate the presentation
		PresentationEx pres = new PresentationEx();
		        
		//Access the presentation slide
		SlideEx slide = pres.getSlides().get_Item(0);
		        
		//Add Smart Art Shape
		SmartArtEx smart = slide.getShapes().addSmartArt(0, 0, 400, 400, SmartArtLayoutTypeEx.BasicBlockList);

		//Saving presentation
		pres.save("data/AsposeSmartArt.pptx",com.aspose.slides.SaveFormat.Pptx);
		
		//Load the desired the presentation
		//pres = new PresentationEx("data/AsposeSmartArt.pptx");

		//Traverse through every shape inside first slide
		for (ShapeEx shape : pres.getSlides().get_Item(0).getShapes())
		{
		    //Check if shape is of SmartArt type
		    if (shape instanceof SmartArtEx)
		    {
		        //Typecast shape to SmartArtEx
				System.out.println("Shape Found");
				SmartArtEx smartArt = (SmartArtEx) shape;
		    }
		}
		System.out.println("Smart Art added and Accessed.");
	}
}

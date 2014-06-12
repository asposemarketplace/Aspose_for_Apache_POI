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

package slides.text;

import com.aspose.slides.AutoShapeEx;
import com.aspose.slides.PresentationEx;
import com.aspose.slides.ShapeEx;
import com.aspose.slides.SlideEx;

public class AsposeReplaceTxtInPlaceHolders
{
	public static void main(String[] args)
	{
		//Instantiate PresentationEx class that represents PPTX
		PresentationEx pres = new PresentationEx("data/demo.pptx");
		
		//Access first slide
		SlideEx slide = pres.getSlides().get_Item(0);
		
		ShapeEx shape= null;
		
		//Iterate through the shapes and set a reference to the table found
		for (int i = 0 ; i < slide.getShapes().getCount() ; i++)
		{
		    shape = slide.getShapes().get_Item(i);
		    if (shape.getPlaceholder() != null)
		    {
		        //Change the text of each placeholder
		        ((AutoShapeEx)shape).getTextFrame().setText("This is Placeholder");
		    }
		}
		
		//Write the PPTX to Disk
		pres.write("data/AsposeReplaceTxt.pptx");

        // Status
        System.out.println("Process completed successfully.");
	}
}

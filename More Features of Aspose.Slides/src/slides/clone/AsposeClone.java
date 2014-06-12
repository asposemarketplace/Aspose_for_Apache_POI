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

package slides.clone;

import com.aspose.slides.PresentationEx;
import com.aspose.slides.SlideExCollection;

public class AsposeClone
{
	public static void main(String[] args)
	{
		//Instantiate PresentationEx class that represents a PPTX file
		PresentationEx pres = new PresentationEx("data/presentation.pptx");
		
		//Clone the desired slide to the end of the collection of slides in the same PPTX
		SlideExCollection slds = pres.getSlides();
		slds.addClone(pres.getSlides().get_Item(0));
		
		//Write the modified pptx to disk
		pres.write("data/AsposeClone.pptx");

        //Printing the status
        System.out.println("Slide cloned successfully!");
	}
}

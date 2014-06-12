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

package slides.thumbnail;

import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

import com.aspose.slides.PresentationEx;
import com.aspose.slides.SlideEx;

public class AsposeThumbnail
{
	public static void main(String[] args) throws Exception
	{
		//Instantiate a PresentationEx class that represents the PPTX file
		PresentationEx pres = new PresentationEx("data/presentation.pptx");
		
		//Access the first slide
		SlideEx sld = pres.getSlides().get_Item(0);
		
		//Create a full scale image
		BufferedImage image = sld.getThumbnail(1f, 1f);
		
		//Save the image to disk in JPEG format
		ImageIO.write(image,"jpeg",new File("data/AsposeThumbnail.jpg"));

        //Printing the status
        System.out.println("Thumbnail created successfully!");
	}
}

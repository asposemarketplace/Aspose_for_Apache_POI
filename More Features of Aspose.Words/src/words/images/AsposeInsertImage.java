/**
 * Copyright (c) Aspose 2002-2014. All Rights Reserved.
 */
package words.images;

import com.aspose.words.Document;
import com.aspose.words.DocumentBuilder;
import com.aspose.words.RelativeHorizontalPosition;
import com.aspose.words.RelativeVerticalPosition;
import com.aspose.words.WrapType;

public class AsposeInsertImage
{
	public static void main(String[] args) throws Exception
	{
		Document doc = new Document();
		DocumentBuilder builder = new DocumentBuilder(doc);

		builder.insertImage("data/background.jpg");
		builder.insertImage("data/background.jpg",
		        RelativeHorizontalPosition.MARGIN,
		        100,
		        RelativeVerticalPosition.MARGIN,
		        200,
		        200,
		        100,
		        WrapType.SQUARE);
		
		doc.save("data/AsposeImageInDoc.docx");
	}
}

/**
 * Copyright (c) Aspose 2002-2014. All Rights Reserved.
 */

package words.clone;

import com.aspose.words.Document;
import com.aspose.words.SaveFormat;

public class AsposeCloneDoc
{
	public static void main(String[] args) throws Exception
	{
		Document doc = new Document("data/document.doc");
		Document clone = doc.deepClone();
		clone.save("data/AsposeClone.doc", SaveFormat.DOC);
	}
}

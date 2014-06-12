/**
 * Copyright (c) Aspose 2002-2014. All Rights Reserved.
 */

package words.protect;

import com.aspose.words.Document;
import com.aspose.words.ProtectionType;
import com.aspose.words.SaveFormat;

public class AsposeProtectDoc
{
	public static void main(String[] args) throws Exception
	{
		Document doc = new Document("data/document.doc");
		doc.protect(ProtectionType.READ_ONLY);
//		doc.protect(ProtectionType.ALLOW_ONLY_COMMENTS);
//		doc.protect(ProtectionType.ALLOW_ONLY_FORM_FIELDS);
//		doc.protect(ProtectionType.ALLOW_ONLY_REVISIONS);
		
		doc.save("data/AsposeProtect.doc", SaveFormat.DOC);
	}
}

package words.document;

import com.aspose.words.Document;
import com.aspose.words.SaveFormat;

public class AsposeOpenExistingDoc
{
	public static void main(String[] args) throws Exception
	{
		Document doc = new Document("data/document.doc");
		
		// Save the document in DOCX format.
		// Aspose.Words supports saving any document in many more formats.
		doc.save("data/Aspose_SaveDoc.docx",SaveFormat.DOCX);
		
        System.out.println("Process Completed Successfully");
	}
}

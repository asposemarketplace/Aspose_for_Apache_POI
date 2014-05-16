package words.append;

import com.aspose.words.Document;
import com.aspose.words.ImportFormatMode;
import com.aspose.words.SaveFormat;

public class AsposeAppendDocs
{
	public static void main(String[] args) throws Exception
	{
		Document doc1 = new Document("data/doc1.doc");
		Document doc2 = new Document("data/doc2.doc");
		
		doc1.appendDocument(doc2, ImportFormatMode.KEEP_SOURCE_FORMATTING);
		
		doc1.save("data/AsposeMerged.doc", SaveFormat.DOC);
	}
}

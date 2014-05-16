package words.trackchanges;

import com.aspose.words.Document;
import com.aspose.words.SaveFormat;

public class AsposeTrackChanges
{
	public static void main(String[] args) throws Exception
	{
		Document doc = new Document("data/trackDoc.doc");
		doc.acceptAllRevisions();
		doc.save("data/AsposeAcceptChanges.doc", SaveFormat.DOC);
	}
}

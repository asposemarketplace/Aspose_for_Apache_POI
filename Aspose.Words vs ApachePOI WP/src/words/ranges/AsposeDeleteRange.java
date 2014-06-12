package words.ranges;

import com.aspose.words.Document;

public class AsposeDeleteRange
{
	public static void main(String[] args) throws Exception
	{
		Document doc = new Document("data/document.doc");
		doc.getSections().get(0).getRange().delete();
		
		String text = doc.getRange().getText();
		
		System.out.println("Range: " + text);
	}
}

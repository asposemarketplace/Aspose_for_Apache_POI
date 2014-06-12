package words.ranges;

import com.aspose.words.Document;
import com.aspose.words.Range;

public class AsposeRanges
{
	public static void main(String[] args) throws Exception
	{
		Document doc = new Document("data/document.doc");
		Range range = doc.getRange();
		
		String text = range.getText();
		System.out.println("Range: " + text);
	}
}

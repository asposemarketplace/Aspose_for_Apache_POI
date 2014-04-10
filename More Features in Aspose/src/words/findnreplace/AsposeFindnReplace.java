package words.findnreplace;

import java.util.regex.Pattern;

import com.aspose.words.Document;
import com.aspose.words.SaveFormat;

// For more info please visit http://www.aspose.com/docs/display/wordsjava/Find+and+Replace+Overview
public class AsposeFindnReplace
{
	public static void main(String[] args) throws Exception
	{
		Document doc = new Document("data/replaceDoc.doc");
		
		// Replaces all 'sad' and 'mad' occurrences with 'bad'
		doc.getRange().replace("sad", "bad", false, true); 
		
		// Replaces all 'sad' and 'mad' occurrences with 'bad'
		doc.getRange().replace(Pattern.compile("[s|m]ad"), "bad");
		
		doc.save("data/AsposeReplaced.doc", SaveFormat.DOC);
	}
}

package words.document;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.hwpf.HWPFDocument;

public class ApacheOpenExistingDoc
{
	public static void main(String[] args) throws Exception
	{
		HWPFDocument doc = new HWPFDocument(new FileInputStream(
				"data/document.doc"));
		
		// write the file
        FileOutputStream out = new FileOutputStream("data/Apache_SaveDoc.doc");
        doc.write(out);
        out.close();
        
        System.out.println("Process Completed Successfully");
	}
}

package words.document;

import java.io.FileOutputStream;

import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;

public class ApacheSaveDocument
{
	public static void main(String[] args) throws Exception
	{
		XWPFDocument document = new XWPFDocument();
		XWPFParagraph tmpParagraph = document.createParagraph();
		
		XWPFRun tmpRun = tmpParagraph.createRun();
		tmpRun.setText("Apache Sample Content for Word file.");
		
		FileOutputStream fos = new FileOutputStream("data/Apache_SaveDoc.doc");
		document.write(fos);
		fos.close();
		
        System.out.println("Process Completed Successfully");
	}
}

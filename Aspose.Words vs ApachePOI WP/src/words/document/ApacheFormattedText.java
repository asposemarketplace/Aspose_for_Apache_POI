package words.document;

import java.io.FileOutputStream;

import org.apache.poi.xwpf.usermodel.ParagraphAlignment;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;

public class ApacheFormattedText
{
	public static void main(String[] args) throws Exception
	{
		// Create a new document from scratch
        XWPFDocument doc = new XWPFDocument();
        
        // create paragraph
        XWPFParagraph para = doc.createParagraph();
        
        // create a run to contain the content
        XWPFRun rh = para.createRun();
        
        // Format as desired
    	rh.setFontSize(15);
    	rh.setFontFamily("Verdana");
        rh.setText("This is the formatted Text");
        rh.setColor("fff000");
        para.setAlignment(ParagraphAlignment.RIGHT);
        
        // write the file
        FileOutputStream out = new FileOutputStream("data/Apache_FormattedText.docx");
        doc.write(out);
        out.close();
        
        System.out.println("Process Completed Successfully");
	}
}

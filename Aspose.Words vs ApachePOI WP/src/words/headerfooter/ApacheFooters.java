package words.headerfooter;

import java.io.FileInputStream;

import org.apache.poi.hwpf.HWPFDocument;
import org.apache.poi.hwpf.usermodel.HeaderStories;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;

public class ApacheFooters
{
	public static void main(String[] args) throws Exception
	{
		POIFSFileSystem fs = null;

		fs = new POIFSFileSystem(new FileInputStream("data/AsposeFooter.doc"));
		HWPFDocument doc = new HWPFDocument(fs);

		int pageNumber = 1;

		HeaderStories headerStore = new HeaderStories(doc);
		String header = headerStore.getFooter(pageNumber);

		System.out.println("Header Is: " + header);
	}
}

package words.images;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.List;

import org.apache.poi.hwpf.HWPFDocument;
import org.apache.poi.hwpf.usermodel.Picture;

public class ApacheExtractImages
{
	public static void main(String[] args) throws Exception
	{
		HWPFDocument doc = new HWPFDocument(new FileInputStream(
				"data/document.doc"));
		List<Picture> pics = doc.getPicturesTable().getAllPictures();
		
		for (int i = 0; i < pics.size(); i++)
		{
			Picture pic = (Picture) pics.get(i);
		
			FileOutputStream outputStream = new FileOutputStream(
					"data/apacheImages/" + "Apache_"
							+ pic.suggestFullFileName());
			outputStream.write(pic.getContent());
			outputStream.close();
		}
	}
}

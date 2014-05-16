package slides.externaldata;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

import com.aspose.slides.AutoShapeEx;
import com.aspose.slides.FillTypeEx;
import com.aspose.slides.PresentationEx;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.ShapeTypeEx;
import com.aspose.slides.SlideEx;

public class ImportHTMLText
{
	public static void main(String[] args) throws Exception
	{
		// Create Empty presentation instance
		PresentationEx pres = new PresentationEx();

		// Acesss the default first slide of presentation

		SlideEx slide = pres.getSlides().get_Item(0);

		// Adding the AutoShape to accomodate the HTML content
		int index = slide.getShapes().addAutoShape(ShapeTypeEx.Rectangle,
				10.0f, 10.0f,
				(float) pres.getSlideSize().getSize().getWidth() - 20,
				(float) pres.getSlideSize().getSize().getHeight() - 10);

		// Accessing the added shape
		AutoShapeEx ashape = (AutoShapeEx) slide.getShapes().get_Item(index);

		ashape.getFillFormat().setFillType(FillTypeEx.NoFill);

		// Adding text frame to the shape
		ashape.addTextFrame("");

		// Clearing all paragraphs in added text frame
		ashape.getTextFrame().getParagraphs().clear();

		// Loading the HTML file using InputStream
		InputStream inputStream = new FileInputStream("c:\\sample.html");
		Reader reader = new InputStreamReader(inputStream);

		int data = reader.read();
		String content = ReadFile("c:\\sample.html");

		// Adding text from HTML stream reader in text frame
		ashape.getTextFrame().getParagraphs().addFromHtml(content);

		// Saving Presentation

		pres.save("data/AsposeImportHTML.pptx", SaveFormat.Pptx);
		System.out.println("Import Successful.");
	}

	private static String ReadFile(String FileName) throws Exception
	{

		File file = new File(FileName);
		StringBuilder contents = new StringBuilder();
		BufferedReader reader = null;

		try
		{
			reader = new BufferedReader(new FileReader(file));
			String text = null;

			// repeat until all lines is read
			while ((text = reader.readLine()) != null)
			{
				contents.append(text).append(
						System.getProperty("line.separator"));
			}
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				if (reader != null)
				{
					reader.close();
				}
			}
			catch (IOException e)
			{
				e.printStackTrace();
				return null;
			}
		}

		return contents.toString();

	}
}

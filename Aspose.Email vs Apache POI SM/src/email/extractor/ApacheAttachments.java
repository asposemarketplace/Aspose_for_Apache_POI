package email.extractor;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

import org.apache.poi.hsmf.MAPIMessage;
import org.apache.poi.hsmf.datatypes.AttachmentChunks;

public class ApacheAttachments
{
	public static void main(String[] args) throws Exception
	{
		MAPIMessage msg = new MAPIMessage("data/message.msg");

		AttachmentChunks[] attachments = msg.getAttachmentFiles();
		if (attachments.length > 0)
		{
			File d = new File("data/attachments");
			if (d.exists() || d.mkdir())
			{
				for (AttachmentChunks attachment : attachments)
				{
					String fileName = attachment.attachFileName.toString();
					if (attachment.attachLongFileName != null)
					{
						fileName = attachment.attachLongFileName.toString();
					}

					File f = new File(d, fileName);
					OutputStream fileOut = null;
					try
					{
						fileOut = new FileOutputStream(f);
						fileOut.write(attachment.attachData.getValue());
					}
					finally
					{
						if (fileOut != null)
						{
							fileOut.close();
						}
					}
				}

			}
		}
	    System.out.println("Done ...");
	}
}

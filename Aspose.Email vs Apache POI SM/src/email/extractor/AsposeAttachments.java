package email.extractor;

import com.aspose.email.Attachment;
import com.aspose.email.MailMessage;
import com.aspose.email.MessageFormat;

public class AsposeAttachments
{
	public static void main(String[] args)
	{
MailMessage message = MailMessage.load("data/message.msg", MessageFormat.getMsg());

System.out.println("Extracting attachments....");
for (int i = 0; i < message.getAttachments().size(); i++)
{
    Attachment att = (Attachment) message.getAttachments().get_Item(i);
    System.out.println("Attachment Name: " + att.getName());

    // Get the name of attachment. If msg subject contains characters like :, /, \ etc., replace with space
    // because windows cannot save files with these characters
    // also save first 50 characters as file name to avoid long file names
    String attFileName = att.getName().replace(".eml", "").replace(":", " ").replace("\\", " ").replace("/", " ").replace("?", "");
    if (attFileName.length() > 50)
    {
        attFileName = attFileName.substring(0, 50);
    }

    // Save the attachment to disk
    att.save("data/" + attFileName);
}
	    System.out.println("Done ...");
	}
}

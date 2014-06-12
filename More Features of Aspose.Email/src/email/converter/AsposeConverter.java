package email.converter;

import com.aspose.email.MailMessage;
import com.aspose.email.MailMessageSaveType;
import com.aspose.email.MessageFormat;

public class AsposeConverter
{
	public static void main(String[] args)
	{
	    // Initialize and Load an existing MSG file by specifying the MessageFormat
	    MailMessage msg = MailMessage.load("data/message.msg", MessageFormat.getMsg());

	    // Save the Email message to disk by specifying the EML and MHT MailMessageSaveType
	    msg.save("data/AsposeMessage.eml", MailMessageSaveType.getEmlFormat());
	    msg.save("data/Asposemessage.mhtml", MailMessageSaveType.getMHtmlFromat());
	    
	    System.out.println("Done");
	}
}

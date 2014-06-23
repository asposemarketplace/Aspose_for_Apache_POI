package email.extractor;

import com.aspose.email.MailMessage;
import com.aspose.email.MessageFormat;

public class AsposeMsgBody
{
	public static void main(String[] args) throws Exception
	{
		MailMessage msg = MailMessage.load("data/message.msg", MessageFormat.getMsg());

		System.out.println("Body:"+ msg.getBody());
		System.out.println("Text Body:"+ msg.getTextBody());
		System.out.println("Text Body HTML:"+ msg.getHtmlBody());
	}
}

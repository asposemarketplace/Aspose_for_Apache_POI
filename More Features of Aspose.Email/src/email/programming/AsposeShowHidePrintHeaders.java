package email.programming;

import com.aspose.email.MailMessage;
import com.aspose.email.MailMessageSaveOptions;
import com.aspose.email.MailMessageSaveType;

public class AsposeShowHidePrintHeaders
{
	public static void main(String[] args)
	{
		MailMessage message = MailMessage.load("data/message.eml");
		String encodedPageHeader = "<div><div class=3D'page=Header'>&quot;Panditharatne, Mithra&quot; &lt;mithra=2Epanditharatne@cibc==2Ecom&gt;<hr/></div>";
		
		int saveOptions =  MailMessageSaveOptions.HideExtraPrintHeader;
		message.save("data/AsposeHideExtraHeaders.mhtml", MailMessageSaveType.getMHtmlFormat(), saveOptions);
		
		System.out.println("Done");
	}
}
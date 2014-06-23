package email.loadnsave;

import com.aspose.email.MailMessage;
import com.aspose.email.MessageFormat;

public class AsposeEmailSave
{
	public static void main(String[] args)
	{
		MailMessage messageMSG 	= MailMessage.load("data/message.msg", MessageFormat.getMsg());
		
		messageMSG.save("data/AsposeMessage.msg", MessageFormat.getMsg());
		messageMSG.save("data/AsposeMessage.eml", MessageFormat.getEml());
		messageMSG.save("data/AsposeMessage.emlx", MessageFormat.getEmlx());
		messageMSG.save("data/AsposeMessage.mht", MessageFormat.getMht());
	}
}

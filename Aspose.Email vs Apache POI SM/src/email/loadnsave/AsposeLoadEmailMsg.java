package email.loadnsave;

import com.aspose.email.MailMessage;
import com.aspose.email.MessageFormat;

public class AsposeLoadEmailMsg
{
	public static void main(String[] args)
	{
		//Create MailMessage instance by loading an Eml/Msg/Emlx/Mht file
		MailMessage messageMSG 	= MailMessage.load("data/message.msg", MessageFormat.getMsg());
		MailMessage messageEML 	= MailMessage.load("data/message.eml", MessageFormat.getEml());
		MailMessage messageEMLX = MailMessage.load("data/message.emlx", MessageFormat.getEmlx());
		MailMessage messageMHT 	= MailMessage.load("data/message.mht", MessageFormat.getMht());
	}
}

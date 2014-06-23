package email.loadnsave;

import org.apache.poi.hsmf.MAPIMessage;

public class ApacheLoadEmailMsg
{
	public static void main(String[] args) throws Exception
	{
		String filename = "data/message.msg";
		MAPIMessage msg = new MAPIMessage(filename);
	}
}

package email.extractor;

import org.apache.poi.hsmf.MAPIMessage;

public class ApacheMsgBody
{
	public static void main(String[] args) throws Exception
	{
	    MAPIMessage msg = new MAPIMessage("data/message.msg");
		System.out.println("Text Body:"+ msg.getTextBody());
	}
}

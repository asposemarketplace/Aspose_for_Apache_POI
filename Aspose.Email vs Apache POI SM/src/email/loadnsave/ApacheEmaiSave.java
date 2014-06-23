package email.loadnsave;

import java.io.PrintWriter;

import org.apache.poi.hsmf.MAPIMessage;

public class ApacheEmaiSave
{
	public static void main(String[] args) throws Exception
	{
		String filename = "data/message.msg";
		MAPIMessage msg = new MAPIMessage(filename);
		
		PrintWriter txtOut = new PrintWriter("data/ApacheMessage.txt");
		txtOut.println("Email Body: " + msg.getTextBody());
		txtOut.close();
	}
}

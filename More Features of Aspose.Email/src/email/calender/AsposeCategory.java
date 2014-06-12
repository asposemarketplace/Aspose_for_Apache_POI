package email.calender;

import com.aspose.email.FollowUpManager;
import com.aspose.email.MailMessageSaveType;
import com.aspose.email.MapiMessage;
import com.aspose.email.system.collections.IList;

public class AsposeCategory
{
	public static void main(String[] args)
	{
		MapiMessage msg = MapiMessage.fromFile("data/message.msg");
		// Add category
		FollowUpManager.addCategory(msg, "Purple Category");

		// Add another category
		FollowUpManager.addCategory(msg, "Red Category");

		// Retrieve the list of available categories
		IList categories = FollowUpManager.getCategories(msg);

		// Remove the specified category
		FollowUpManager.removeCategory(msg, "Red Category");

		// Clear all categories
		//FollowUpManager.clearCategories(msg);
		
		msg.save("data/AsposeCategories.msg");
		
		System.out.println("Done");
	}
}

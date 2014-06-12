package email.calender;

import com.aspose.email.Appointment;
import com.aspose.email.AppointmentFormattingOptions;

public class AsposeFormatAppointments
{
	public static void main(String[] args)
	{
		Appointment appointment = Appointment.load("data/appointment.ics");
		AppointmentFormattingOptions formattingOptions = new AppointmentFormattingOptions();
		formattingOptions.setLocationFormat("Where: {0}");
		formattingOptions.setTitleFormat("Subject: {0}");
		formattingOptions.setDescriptionFormat("\r\n*~*~*~*~*~*~*~*~*~*\r\n{0}");
		System.out.println(appointment.getAppointmentText(formattingOptions));
	}
}

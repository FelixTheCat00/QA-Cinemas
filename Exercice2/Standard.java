import java.util.Date;
import java.util.Calendar;

class Standard extends Customer {
	
	public int ticketPrice(){
		Date now = new Date();
		Calendar calendar = Calendar.getInstance();
    calendar.setTime(now);
		if(calendar.get(Calendar.DAY_OF_WEEK) == 4)
		{
			setTicketPrice(6);
		}
		else
		{
		  setTicketPrice(8);
		}
		
		return getTicketPrice();
		
	}
}
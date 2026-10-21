package DateandTimeAPI.LocalDateTime;
import java.time.*;
public class LocalDateTimePlusHours 
{
	public static void main(String[] args) 
	{
		LocalTime a=LocalTime.now();
		LocalTime b=a.plusHours(4);
		System.out.println(b);
	}
}

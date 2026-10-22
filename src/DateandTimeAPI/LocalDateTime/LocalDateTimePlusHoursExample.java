package DateandTimeAPI.LocalDateTime;
import java.time.*;
public class LocalDateTimePlusHoursExample 
{
	public static void main(String[] args) 
	{
		LocalTime a=LocalTime.now();
		System.out.println(a);
		LocalTime b=a.plusHours(5);
		System.out.println(b);
		LocalTime c=a.plusHours(-10);
		System.out.println(c);
	}
}

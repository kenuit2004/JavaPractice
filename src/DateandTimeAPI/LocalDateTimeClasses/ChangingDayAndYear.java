package DateandTimeAPI.LocalDateTimeClasses;
import java.time.*;
public class ChangingDayAndYear 
{
	public static void main(String[] args) 
	{
		LocalDateTime a=LocalDateTime.now();
		LocalDateTime b=a.withDayOfMonth(30).withYear(2027);
		System.out.println(b);
	}
}

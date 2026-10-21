package DateandTimeAPI.LocalDateTime;
import java.time.*;
public class LocalDateTimeWithnowSimple 
{
	public static void main(String[] args) 
	{
		LocalDate a=LocalDate.now();
		System.out.println(a);
		LocalTime b=LocalTime.now();
		System.out.println(b);
		LocalDateTime c=LocalDateTime.now();
		System.out.println(c);
	}
}

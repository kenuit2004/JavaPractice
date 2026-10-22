package DateandTimeAPI.LocalDateTime;
import java.time.*;
public class LocalDateTimeMinusMinutes 
{
	public static void main(String[] args) 
	{
		LocalTime a=LocalTime.parse("01:01:23.23");
		System.out.println(a);
		LocalTime b=a.minusMinutes(120);
		System.out.println(b);
	}
}

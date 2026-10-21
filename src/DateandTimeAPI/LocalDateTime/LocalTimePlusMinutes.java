package DateandTimeAPI.LocalDateTime;
import java.time.*;
public class LocalTimePlusMinutes 
{
	public static void main(String[] args) 
	{
		LocalTime a=LocalTime.now();
		LocalTime b=a.plusMinutes(120);
		System.out.println(b);
	}
}

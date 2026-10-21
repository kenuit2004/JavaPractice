package DateandTimeAPI.LocalDateTime;
import java.time.*;
public class LocalDateTimeWithDayOfYear 
{
	public static void main(String[] args) 
	{
		LocalDate a=LocalDate.parse("2020-10-01");
		LocalDate b=a.withDayOfYear(150);
		System.out.println(b);
	}
}

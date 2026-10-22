package DateandTimeAPI.LocalDateTime;
import java.time.*;
public class LocalDateTimeMinusDays 
{
	public static void main(String[] args) 
	{
		LocalDate a=LocalDate.now();
		System.out.println(a);
		LocalDate b=a.minusDays(10);
		System.out.println(b);
		LocalDate c=a.minusDays(-20);
		System.out.println(c);
	}
}

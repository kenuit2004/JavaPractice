package DateandTimeAPI.LocalDateTime;
import java.time.*;
public class LocalDateTimePlusDays 
{
	public static void main(String[] args) 
	{
		LocalDate a=LocalDate.now();
		System.out.println(a);
		LocalDate b=a.plusDays(10);
		System.out.println(b);
		LocalDate c=a.plusDays(-20);
		System.out.println(c);
	}
}

package DateandTimeAPI.LocalDateTime;
import java.time.*;
public class LocalDateTimeAllPlusOperation 
{
	public static void main(String[] args) 
	{
		LocalDateTime a=LocalDateTime.now();
		System.out.println(a);
		LocalDateTime b=a.plusYears(10)
				         .plusMonths(1)
				         .plusDays(1)
				         .plusWeeks(1);
		System.out.println(b);
		LocalDateTime c=b.minusYears(10)
		         .minusMonths(1)
		         .minusDays(1)
		         .minusWeeks(1);
		System.out.println(c);
		LocalDateTime d=c.plusHours(10)
		         .plusMinutes(1)
		         .plusSeconds(1)
		         .plusNanos(1);
		System.out.println(d);
		LocalDateTime e=d.minusHours(10)
		         .minusMinutes(1)
		         .minusSeconds(1)
		         .minusNanos(1);
		System.out.println(e);
		
	}
}

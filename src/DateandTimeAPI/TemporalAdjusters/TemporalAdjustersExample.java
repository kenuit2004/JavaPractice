package DateandTimeAPI.TemporalAdjusters;
import java.time.*;
import java.time.temporal.*;
public class TemporalAdjustersExample 
{
	public static void main(String[] args) 
	{
		LocalDate a=LocalDate.now();
		LocalDate b=a.with(TemporalAdjusters.firstDayOfMonth());
		System.out.println(b);
		LocalDate c=a.with(TemporalAdjusters.lastDayOfMonth());
		System.out.println(c);
		LocalDate d=a.with(TemporalAdjusters.firstDayOfNextMonth());
		System.out.println(d);
		LocalDate e=a.with(TemporalAdjusters.next(DayOfWeek.WEDNESDAY));
		System.out.println(e);
	}
}

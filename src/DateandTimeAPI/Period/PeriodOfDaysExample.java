package DateandTimeAPI.Period;
import java.time.*;
import java.time.temporal.*;
public class PeriodOfDaysExample 
{
	public static void main(String[] args) 
	{
		Period a=Period.ofDays(10);
		Temporal b=a.addTo(LocalDate.now());
		System.out.println(b);
	}
}

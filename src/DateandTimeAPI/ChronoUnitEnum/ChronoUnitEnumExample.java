package DateandTimeAPI.ChronoUnitEnum;
import java.time.*;
import java.time.temporal.*;
public class ChronoUnitEnumExample 
{
	public static void main(String[] args)
	{
		LocalDate a=LocalDate.now();
		LocalDate b=a.plus(1,ChronoUnit.DAYS);
		System.out.println(b);
		LocalDate c=a.plus(2,ChronoUnit.MONTHS);
		System.out.println(c);
		LocalDate d=a.plus(5,ChronoUnit.YEARS);
		System.out.println(d);
		LocalDate e=a.plus(1,ChronoUnit.WEEKS);
		System.out.println(e);
		LocalDate f=a.plus(1,ChronoUnit.DECADES);
		System.out.println(f);
	}
}

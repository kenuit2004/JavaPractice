package DateandTimeAPI.Period;
import java.time.*;
public class PeriodExample 
{
	public static void main(String[] args) 
	{
		LocalDate a=LocalDate.now();
		LocalDate b=LocalDate.of(2010,Month.MARCH,20);
		Period c=Period.between(b, a);
		System.out.println(c);
	}
}

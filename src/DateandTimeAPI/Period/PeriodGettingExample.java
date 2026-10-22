package DateandTimeAPI.Period;
import java.time.*;
public class PeriodGettingExample 
{

	public static void main(String[] args) 
	{
		LocalDate a=LocalDate.of(2020,11,01);
		LocalDate b=LocalDate.now();
		Period c=Period.between(a,b);
		System.out.println(c);
		System.out.println(c.getYears());
		System.out.println(c.getMonths());
		System.out.println(c.getDays());
	}

}

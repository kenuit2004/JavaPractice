package DateandTimeAPI.Period;
import java.time.*;
public class PeriodMonths 
{
	public static void main(String[] args) 
	{
		Period a=Period.ofMonths(10);
		Period b=a.minus(Period.ofMonths(2));
		System.out.println(b);
	}
}

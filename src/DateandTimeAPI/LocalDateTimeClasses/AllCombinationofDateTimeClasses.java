package DateandTimeAPI.LocalDateTimeClasses;
import java.time.*;
import java.time.format.*;
public class AllCombinationofDateTimeClasses 
{
	public static void main(String[] args) 
	{
		LocalDate a=LocalDate.now();
		System.out.println(a);
		LocalTime b=LocalTime.now();
		System.out.println(b);
		LocalDateTime c=LocalDateTime.now();
		System.out.println(c);
		DateTimeFormatter d=DateTimeFormatter.ofPattern("dd-MM-yyyy hh:mm:ss a");
		String e=c.format(d);
		System.out.println(e);
		LocalDate f=LocalDate.of(2030, 10, 1);
		System.out.println(f);
		Month month=c.getMonth();
		int day=c.getDayOfMonth();
		int second=c.getSecond();
		System.out.println(month+" "+day+" "+second);
		LocalDateTime g=c.withDayOfMonth(30).withYear(2030);
		System.out.println(g);
		
	}
}

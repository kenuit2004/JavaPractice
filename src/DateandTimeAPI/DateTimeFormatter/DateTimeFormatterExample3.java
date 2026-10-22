package DateandTimeAPI.DateTimeFormatter;
import java.time.*;
import java.time.format.*;
import java.util.*;
import java.time.temporal.*;
public class DateTimeFormatterExample3 
{
	public static void main(String[] args) 
	{
		LocalDate a=LocalDate.now();
		System.out.println(a);
		String b=a.format(DateTimeFormatter.ISO_LOCAL_DATE);
		System.out.println(b);
		DateTimeFormatter c=DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String d=a.format(c);
		System.out.println(d);
		DateTimeFormatter e=DateTimeFormatter.ofPattern("dd. MMMM yyyy",Locale.ENGLISH);
		String f=a.format(e);
		System.out.println(f);
		DateTimeFormatterBuilder x=new DateTimeFormatterBuilder();
		DateTimeFormatter y=x
		 .appendValue(ChronoField.DAY_OF_MONTH)
		 .appendLiteral(". ")
		 .appendText(ChronoField.MONTH_OF_YEAR)
		 .appendLiteral(" ")
		 .appendValue(ChronoField.YEAR)
		 .toFormatter(Locale.ENGLISH);
		String z=a.format(y);
		System.out.println(z);
	}
}

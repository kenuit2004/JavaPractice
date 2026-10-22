package DateandTimeAPI.DateTimeFormatter;
import java.time.LocalDate;
import java.time.format.*;
import java.time.temporal.*;
import java.time.*;
public class DateTimeFormatterExample1 
{
	public static void main(String[] args) 
	{
		DateTimeFormatterBuilder a=new DateTimeFormatterBuilder();
		DateTimeFormatter b=a
		 .appendLiteral("Day is:")
		 .appendValue(ChronoField.DAY_OF_MONTH)
		 .appendLiteral(" ,Month is:")
		 .appendValue(ChronoField.MONTH_OF_YEAR)
		 .toFormatter();
		LocalDate aa=LocalDate.now();
		String bb=aa.format(b);
		System.out.println(bb);
	}

}

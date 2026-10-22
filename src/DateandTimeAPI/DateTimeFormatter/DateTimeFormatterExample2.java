package DateandTimeAPI.DateTimeFormatter;
import java.time.format.*;
import java.time.temporal.*;
import java.time.*;
public class DateTimeFormatterExample2 
{
	public static void main(String[] args) 
	{
		DateTimeFormatterBuilder a=new DateTimeFormatterBuilder();
		DateTimeFormatter b=a
		 .appendPattern("[yyyy][yyyyMM][yyyyMMdd]")
		 .optionalStart()
		 .parseDefaulting(ChronoField.DAY_OF_MONTH,1)
		 .parseDefaulting(ChronoField.MONTH_OF_YEAR,1)
		 .optionalEnd()
		 .toFormatter();
		System.out.println(b.parse("2020",LocalDate::from));
		System.out.println(b.parse("202004",LocalDate::from));
		System.out.println(b.parse("20200431",LocalDate::from));
	}
}

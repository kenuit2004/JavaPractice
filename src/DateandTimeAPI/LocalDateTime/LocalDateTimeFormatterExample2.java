package DateandTimeAPI.LocalDateTime;
import java.time.*;
import java.time.format.*;
public class LocalDateTimeFormatterExample2 
{
	public static void main(String[] args) 
	{
		LocalDateTime a=LocalDateTime.parse("2016-09-06T12:45:30");
		System.out.println(a.format(DateTimeFormatter.ISO_DATE_TIME));
		System.out.println(a.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
		System.out.println(a.format(DateTimeFormatter.ISO_TIME));
		System.out.println(a.format(DateTimeFormatter.ISO_LOCAL_TIME));
		System.out.println(a.format(DateTimeFormatter.ISO_ORDINAL_DATE));
		System.out.println(a.format(DateTimeFormatter.ISO_WEEK_DATE));
	}
}

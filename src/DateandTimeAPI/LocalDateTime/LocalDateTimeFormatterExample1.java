package DateandTimeAPI.LocalDateTime;
import java.time.*;
import java.time.format.*;
public class LocalDateTimeFormatterExample1 
{
	public static void main(String[] args) 
	{
		LocalDateTime b=LocalDateTime.parse("2018-11-03T12:45:03");
		System.out.println(b);
		System.out.println((b).format(DateTimeFormatter.ISO_DATE));
		System.out.println((b).format(DateTimeFormatter.ISO_LOCAL_DATE));
		System.out.println((b).format(DateTimeFormatter.BASIC_ISO_DATE));
		System.out.println((b).format(DateTimeFormatter.ISO_TIME));
		System.out.println((b).format(DateTimeFormatter.ISO_LOCAL_TIME));
	}
}

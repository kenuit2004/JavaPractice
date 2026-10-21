package DateandTimeAPI.ZonedDateTime;
import java.time.*;
import java.time.format.*;
public class CombinationodZonedDateTimeClasses 
{
	public static void main(String[] args) 
	{
		LocalDateTime a=LocalDateTime.now();
		System.out.println(a);
		DateTimeFormatter b=DateTimeFormatter.ofPattern("dd-MM-yyyy hh:mm:ss a");
		String c=a.format(b);
		System.out.println(c);
		ZonedDateTime d=ZonedDateTime.now();
		System.out.println(d);
		ZoneId e=ZoneId.of("Asia/Tokyo");
		ZonedDateTime f=d.withZoneSameInstant(e);
		System.out.println(f);
		String g=f.format(b);
		System.out.println(g);
	}

}

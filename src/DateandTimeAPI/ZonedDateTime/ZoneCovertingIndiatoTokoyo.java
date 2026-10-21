package DateandTimeAPI.ZonedDateTime;
import java.time.*;
public class ZoneCovertingIndiatoTokoyo 
{
	public static void main(String[] args) 
	{
		ZonedDateTime a=ZonedDateTime.now();
		System.out.println(a);
		ZoneId b=ZoneId.of("Asia/Tokyo");
		ZonedDateTime c=a.withZoneSameInstant(b);
		System.out.println(c);
	}
}

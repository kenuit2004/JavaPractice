package DateandTimeAPI.LocalDateTime;
import java.time.*;
import java.time.format.*;
public class LocalDateTimeWithCustom 
{
	public static void main(String[] args) 
	{
		LocalDateTime a=LocalDateTime.now();
		DateTimeFormatter b=DateTimeFormatter.ofPattern("dd-MM-yyyy hh:mm:ss");
		String result=a.format(b);
		System.out.println(result);
	}
}

package DateandTimeAPI.LocalDateTime;
import java.time.*;
public class ExtractingMonthDaySecond 
{
	public static void main(String[] args) 
	{
		LocalDateTime a=LocalDateTime.now();
		System.out.println(a.getMonth()+" "+a.getDayOfMonth()+" "+a.getSecond());
	}
}

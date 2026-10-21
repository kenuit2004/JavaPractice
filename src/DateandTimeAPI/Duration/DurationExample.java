package DateandTimeAPI.Duration;
import java.time.*;
public class DurationExample 
{
	public static void main(String[] args) 
	{
		LocalTime a=LocalTime.now();
		Duration b=Duration.ofHours(7);
		LocalTime c=a.plus(b);
		Duration d=Duration.between(a,c);
		System.out.println(d);
	}
}

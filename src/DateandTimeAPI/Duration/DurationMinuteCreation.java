package DateandTimeAPI.Duration;
import java.time.*;
public class DurationMinuteCreation 
{
	public static void main(String[] args) 
	{
		Duration a=Duration.ofMinutes(10);
		System.out.println(a.toMinutes());
		System.out.println(a.getSeconds());
		Duration b=Duration.ofMinutes(-10);
		System.out.println(b.toMinutes());
		System.out.println(b.getSeconds());
	}
}

package DateandTimeAPI.LocalDateTime;
import java.time.*;
public class LocalDateTimeAllWays 
{
	public static void main(String[] args) 
	{
		LocalDateTime a=LocalDateTime.of(2020,5,1,10,01,20,1234);
		System.out.println(a);
		LocalDateTime b=LocalDateTime.of(2020,Month.MAY,1,10,01,20,1234);
		System.out.println(b);
		LocalDateTime c=LocalDateTime.of(2020,5,1,10,01,20);
		System.out.println(c);
		LocalDateTime d=LocalDateTime.of(2020,5,1,10,01);
		System.out.println(d);
		LocalDate aa=LocalDate.of(2020,5,1);
		LocalTime bb=LocalTime.of(10,01);
		LocalDateTime e=LocalDateTime.of(aa,bb);
		System.out.println(e);
	}
}

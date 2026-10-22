package DateandTimeAPI.LocalDateTime;
import java.time.*;
public class LocalDateTimePlusYears 
{
	public static void main(String[] args) 
	{
		LocalDate a=LocalDate.now();
		System.out.println(a);
		LocalDate b=a.plusYears(10);
		System.out.println(b);
		LocalDate c=a.plusYears(-20);
		System.out.println(c);
	}
}

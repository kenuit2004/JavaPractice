package DateandTimeAPI.LocalDateTime;
import java.time.*;
public class LocalDateTimeMinusYears  
{
	public static void main(String[] args) 
	{
		LocalDate a=LocalDate.now();
		System.out.println(a);
		LocalDate b=a.minusYears(10);
		System.out.println(b);
		LocalDate c=a.minusYears(-20);
		System.out.println(c);
	}
}

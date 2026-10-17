package Java8.FunctionInterface.Optional.ofNullable;
import java.util.*;
public class ofNullableSimpleExample 
{
	public static void main(String[] args) 
	{
		String a[]=new String[10];
		Optional<String> b=Optional.ofNullable(a[2]);
		if(b.isPresent())
		{
			String c=b.get().toUpperCase();
			System.out.println(c);
		}
		else
		{
			System.out.println("Values are Null");
		}
	}
}

package Java8.FunctionInterface.Optional.ofNullable;
import java.util.*;
public class ofNullableExample2 
{
	public static void main(String[] args) 
	{
		String a="Lion";
		Optional<String> b=Optional.ofNullable(a);
		System.out.println(b);
	}
}

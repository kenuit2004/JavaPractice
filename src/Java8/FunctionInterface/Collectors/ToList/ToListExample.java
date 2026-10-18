package Java8.FunctionInterface.Collectors.ToList;
import java.util.stream.*;
import java.util.*;
public class ToListExample 
{
	public static void main(String[] args) 
	{
		Stream<String> a=Stream.of("Lion","Tiger","Dog","Cat");
		List<String> b=a
		 .collect(Collectors.toList());
		System.out.println(b);
	}
}

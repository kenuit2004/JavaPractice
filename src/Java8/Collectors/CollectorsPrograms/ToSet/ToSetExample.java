package Java8.Collectors.CollectorsPrograms.ToSet;
import java.util.stream.*;
import java.util.*;
public class ToSetExample 
{
	public static void main(String[] args) 
	{
		Stream<String> a=Stream.of("Lion","Tiger","Dog","Cat");
		Set<String> b=a
		 .collect(Collectors.toSet());
		System.out.println(b);
	}
}

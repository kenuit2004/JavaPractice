package Java8.FunctionInterface.Collectors.ToCollection;
import java.util.stream.*;
import java.util.*;
public class ToCollectionExample 
{
	public static void main(String[] args) 
	{
		Stream<String> a=Stream.of("Lion","Tiger","Dog","Cat");
		Collection<String> b=a
		                     .collect(Collectors.toCollection(TreeSet::new));
		System.out.println(b);
	}
}

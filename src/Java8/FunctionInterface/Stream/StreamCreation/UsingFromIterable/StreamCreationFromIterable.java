package Java8.FunctionInterface.Stream.StreamCreation.UsingFromIterable;
import java.util.*;
import java.util.stream.*;
public class StreamCreationFromIterable 
{
	static <T> void ken(Iterable<T> a)
	{
		Stream<T> b=StreamSupport.stream(a.spliterator(),false);
		Iterator<T> c=b.iterator();
		while(c.hasNext())
		{
			System.out.println(c.next());
		}
	}
	public static void main(String[] args) 
	{
		List<String> a=new ArrayList<>();
		a.add("Lion");
		a.add("Tiger");
		a.add("Dog");
		a.add("Cat");
		Iterable<String> b=a;
		ken(b);
	}
}

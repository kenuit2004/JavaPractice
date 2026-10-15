package Java8.FunctionInterface.Stream;
import java.util.stream.*;
import java.util.*;
public class StreamBuilderIterator 
{
	static void ken()
	{
		Stream.Builder<String> a=Stream.builder();
		Stream<String> b=a.add("Lion")
		.add("Tiger")
		.add("Dog")
		.add("Cat").build();
		Iterator<String> c=b.iterator();
		while(c.hasNext())
		{
			System.out.println(c.next());
		}
	}
	public static void main(String[] args) 
	{
		ken();
	}
}

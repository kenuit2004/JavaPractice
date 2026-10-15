package Java8.FunctionInterface.Stream.StreamCreation.UsingCollection;
import java.util.*;
import java.util.stream.Stream;
public class StreamCreationusingCollection 
{
	static <T> void ken(List<T> list)
	{
		Stream<T> b=list.stream();
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
		ken(a);
		List<Integer> b=new ArrayList<>();
		b.add(10);
		b.add(20);
		b.add(30);
		b.add(40);
		ken(b);
	}
}

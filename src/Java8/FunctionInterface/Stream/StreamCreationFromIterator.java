package Java8.FunctionInterface.Stream;
import java.util.*;
import java.util.stream.*;
public class StreamCreationFromIterator 
{
	static <T> void ken(Iterator<T> a)
	{
		Spliterator<T> b=Spliterators.spliteratorUnknownSize(a,Spliterator.NONNULL);
		Stream<T> c=StreamSupport.stream(b,false);
		Iterator<T> d=c.iterator();
		while(d.hasNext())
		{
			System.out.println(d.next());
		}
	}
	public static void main(String[] args) 
	{
		List<String> a=new ArrayList<>();
		a.add("Lion");
		a.add("Tiger");
		a.add("Dog");
		a.add("Cat");
		Iterator<String> b=a.iterator();
		ken(b);
	}
}

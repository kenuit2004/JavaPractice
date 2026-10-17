package Java8.FunctionInterface.Stream.CollectionvsStream;
import java.util.*;
public class CollectionMethod 
{
	public static void main(String[] args) 
	{
		List<String> a=new ArrayList<>();
		a.add("Lion");
		a.add("Tiger");
		a.add("Dog");
		a.add("Cat");
		Collections.sort(a,(String x,String y)->x.compareTo(y));
		for(String b:a)
		{
			System.out.println(b);
		}
	}
}

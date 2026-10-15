package Java8.FunctionInterface.Stream.StreamCreation.UsingArray;
import java.util.*;
import java.util.stream.*;
public class ArrayStreamUsingCustomTypeinofmethod 
{
	static <T> void ken(T a[])
	{
		Stream<T> b=Stream.of(a);
		Iterator<T> c=b.iterator();
		while(c.hasNext())
		{
			System.out.println(c.next());
		}
	}
	public static void main(String[] args) 
	{
		String a[]= {"Lion","Tiger","Dog","Cat"};
		ken(a);
		Integer b[]= {1,2,3,4,5,6};
		ken(b);
	}
}

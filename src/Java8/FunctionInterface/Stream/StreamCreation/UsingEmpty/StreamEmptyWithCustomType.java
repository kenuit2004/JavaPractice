package Java8.FunctionInterface.Stream.StreamCreation.UsingEmpty;
import java.util.stream.*;
import java.util.*;
public class StreamEmptyWithCustomType 
{
	static void ken()
	{
		Stream<String> a=Stream.empty();
		Iterator<String> b=a.iterator();
		while(b.hasNext())
		{
			System.out.println(b.next());
		}
	}
	public static void main(String[] args) 
	{
		ken();
	}
}

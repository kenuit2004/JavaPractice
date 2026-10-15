package Java8.FunctionInterface.Stream;
import java.util.*;
import java.util.stream.Stream;
public class ArrayStream1 
{
	public static void main(String[] args) 
	{
		String a[]= {"Lion","Tiger","Dog","Cat"};
		Stream<String> b=Arrays.stream(a);
		b.forEach(System.out::println);
	}
}

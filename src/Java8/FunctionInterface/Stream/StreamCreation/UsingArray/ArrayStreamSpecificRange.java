package Java8.FunctionInterface.Stream.StreamCreation.UsingArray;
import java.util.*;
import java.util.stream.*;
public class ArrayStreamSpecificRange 
{
	public static void main(String[] args) 
	{
		String a[]= {"Lion","Tiger","Dog","Cat"};
		Stream<String> b=Arrays.stream(a,0,1);
		b.forEach(System.out::println);
	}
}

package Java8.FunctionInterface.Stream.StreamCreation.UsingArray;
import java.util.*;
import java.util.stream.*;
public class IntArrayStream 
{
	public static void main(String[] args) 
	{
		int a[]= {1,2,3,4,5};
		IntStream b=Arrays.stream(a);
		b.forEach(System.out::println);
	}
}
package Java8.Stream.StreamPrograms.StreamCreation.UsingArray;
import java.util.*;
import java.util.stream.*;
public class ArrayIntStreamConversion 
{
	public static void main(String[] args) 
	{
		int a[]= {1,2,3,4,5,6};
		IntStream b=Arrays.stream(a,0,3);
		b.forEach(System.out::println);
	}
}

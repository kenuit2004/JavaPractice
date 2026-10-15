package Java8.FunctionInterface.Stream.StreamCreation.UsingInfinite;
import java.util.stream.*;
public class InfiniteStream 
{
	static void ken(long start,int end)
	{
		Stream.iterate(start,n->n*n)
		.limit(end)
		.forEach(System.out::println);
	}
	public static void main(String[] args)
	{
		ken(2,6);
	}
}

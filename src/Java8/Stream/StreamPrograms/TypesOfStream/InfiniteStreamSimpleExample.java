package Java8.Stream.StreamPrograms.TypesOfStream;
import java.util.stream.*;
public class InfiniteStreamSimpleExample 
{
	public static void main(String[] args) 
	{
		Stream.iterate(1,i->i+1)
		.limit(10)
		.forEach(System.out::println);
	}
}

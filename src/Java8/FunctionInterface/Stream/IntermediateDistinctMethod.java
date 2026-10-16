package Java8.FunctionInterface.Stream;
import java.util.stream.*;
public class IntermediateDistinctMethod 
{
	public static void main(String[] args) 
	{
		Stream<Integer> a=Stream.of(1,2,3,4,4,3,2);
		a.distinct().forEach(System.out::println);
	}
}

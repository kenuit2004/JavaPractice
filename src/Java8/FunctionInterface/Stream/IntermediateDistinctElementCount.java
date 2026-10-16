package Java8.FunctionInterface.Stream;
import java.util.stream.*;
public class IntermediateDistinctElementCount 
{
	public static void main(String[] args) 
	{
		Stream<Integer> a=Stream.of(1,2,3,2,1,4,5,3,2,10);
		long b=a.distinct().count();
		System.out.println(b);
	}
}

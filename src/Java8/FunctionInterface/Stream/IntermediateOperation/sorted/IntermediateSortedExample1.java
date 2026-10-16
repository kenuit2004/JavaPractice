package Java8.FunctionInterface.Stream.IntermediateOperation.sorted;
import java.util.stream.*;
public class IntermediateSortedExample1 
{
	public static void main(String[] args) 
	{
		IntStream a=IntStream.of(1,4,2,6,3,7,9);
		a
		 .sorted()
		 .forEach(System.out::println);
	}
}

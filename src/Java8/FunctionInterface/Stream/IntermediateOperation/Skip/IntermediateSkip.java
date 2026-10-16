package Java8.FunctionInterface.Stream.IntermediateOperation.Skip;
import java.util.stream.*;
public class IntermediateSkip 
{
	public static void main(String[] args) 
	{
		IntStream a=IntStream.range(1,20);
		a
		 .skip(10)
		 .forEach(System.out::println);
	}
}

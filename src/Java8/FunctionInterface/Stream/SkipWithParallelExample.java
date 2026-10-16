package Java8.FunctionInterface.Stream;
import java.util.stream.*;
public class SkipWithParallelExample 
{
	public static void main(String[] args) 
	{
		IntStream a=IntStream.range(1,10);
		a
		 .parallel()
		 .skip(2)
		 .forEachOrdered(System.out::println);
	}
}

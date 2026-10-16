package Java8.FunctionInterface.Stream.IntermediateOperation.Skip;
import java.util.stream.*;
public class SkipWithIterateExample 
{
	public static void main(String[] args) 
	{
		Stream.iterate(1,i->i+1)
		       .skip(2)
		       .limit(10)
		       .forEach(System.out::println);
	}
}

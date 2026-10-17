package Java8.FunctionInterface.Stream.TypesOfStream;
import java.util.stream.*;
public class PrimitiveSimpleExample 
{
	public static void main(String[] args) 
	{
		IntStream a=IntStream.range(0,10);
		a.forEach(System.out::println);
	}
}

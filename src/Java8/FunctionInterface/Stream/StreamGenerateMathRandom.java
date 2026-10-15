package Java8.FunctionInterface.Stream;
import java.util.stream.*;
public class StreamGenerateMathRandom 
{
	static void ken(int a)
	{
		Stream.generate(Math::random)
		.limit(a)
		.forEach(System.out::println);
	}
	public static void main(String[] args) 
	{
		ken(5);
	}
}

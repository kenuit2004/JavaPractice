package Java8.FunctionInterface.Stream.StreamCreation.UsingStreamGenerate;
import java.util.stream.*;
import java.util.*;
public class StreamGenerateSimple 
{
	public static void main(String[] args) 
	{
		Stream.generate(new Random()::nextInt)
		.limit(5)
		.forEach(System.out::println);
	}
}

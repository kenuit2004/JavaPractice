package Java8.FunctionInterface.Stream;
import java.util.stream.*;
public class StreamEmpty 
{
	public static void main(String[] args) 
	{
		Stream<String> a=Stream.empty();
		a.forEach(System.out::println);
	}
}

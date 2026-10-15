package Java8.FunctionInterface.Stream;
import java.util.stream.*;
public class StreamBuilderExample1 
{
	public static void main(String[] args) 
	{
		Stream.Builder<String> a=Stream.builder();
		Stream<String> b=a.add("Kenuit").build();
		b.forEach(System.out::println);
	}
}
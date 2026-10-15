package Java8.FunctionInterface.Stream.StreamCreation.UsingStreamOf;
import java.util.stream.Stream;
public class StreamCreationUsingStreamof 
{
	public static void main(String[] args) 
	{
		Stream<String> a=Stream.of("Lion","Tiger","Dog","Cat");
		a.forEach(System.out::println);
	}
}
package Java8.FunctionInterface.Stream;
import java.util.stream.*;
public class StreamBuilderWithMultipleAdding 
{	
	public static void main(String[] args) 
	{
		Stream.Builder<String> a=Stream.builder();
		Stream<String> b=a.add("Lion")
				.add("Tiger")
				.add("Dog")
				.add("Cat").build();
	    b.forEach(System.out::println);
	}
}

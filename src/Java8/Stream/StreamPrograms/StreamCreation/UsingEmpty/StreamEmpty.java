package Java8.Stream.StreamPrograms.StreamCreation.UsingEmpty;
import java.util.stream.*;
public class StreamEmpty 
{
	public static void main(String[] args) 
	{
		Stream<String> a=Stream.empty();
		a.forEach(System.out::println);
	}
}

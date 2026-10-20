package Java8.Stream.StreamPrograms.CollectionvsStream;
import java.util.*;
public class StreamMethod 
{
	public static void main(String[] args) 
	{
		List<String> a=new ArrayList<>();
		a.add("Lion");
		a.add("Tiger");
		a.add("Dog");
		a.add("Cat");
		a.stream()
		         .sorted()
		         .forEach(System.out::println);
	}
}

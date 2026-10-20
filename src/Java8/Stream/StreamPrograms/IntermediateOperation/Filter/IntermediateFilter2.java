package Java8.Stream.StreamPrograms.IntermediateOperation.Filter;
import java.util.stream.*;
public class IntermediateFilter2 
{
	public static void main(String[] args) 
	{
		Stream<String> b=Stream.of( "Geeks", "fOr", "GEEKSQUIZ", "GeeksforGeeks");
		b
		 .filter(str->Character.isUpperCase(str.charAt(1)))
		 .forEach(System.out::println);
	}
}

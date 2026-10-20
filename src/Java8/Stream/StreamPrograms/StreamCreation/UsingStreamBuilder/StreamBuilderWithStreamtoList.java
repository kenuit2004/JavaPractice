package Java8.Stream.StreamPrograms.StreamCreation.UsingStreamBuilder;
import java.util.stream.*;
import java.util.*;
public class StreamBuilderWithStreamtoList 
{
	public static void main(String[] args) 
	{
		Stream.Builder<String> a=Stream.builder();
		Stream<String> b=a.add("LION")
		.add("TIGER")
		.add("Dog")
		.add("Cat").build();
		List<String> c=b.map(String::toLowerCase)
				         .collect(Collectors.toList());
		System.out.println(c);
	}
}

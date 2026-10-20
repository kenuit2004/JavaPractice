package Java8.Stream.StreamPrograms.IntermediateOperation.Map;
import java.util.*;
import java.util.stream.*;
public class IntermediateMap2 
{
	public static void main(String[] args) 
	{
		List<String> a=new ArrayList<>();
		a.add("lion");
		a.add("tiger");
		a.add("dog");
		a.add("cat");
		List<String> b=a.stream()
		         .map(String::toUpperCase)
		         .collect(Collectors.toList());
		System.out.println(b);
	}
}

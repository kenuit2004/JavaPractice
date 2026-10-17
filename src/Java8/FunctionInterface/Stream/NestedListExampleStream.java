package Java8.FunctionInterface.Stream;
import java.util.*;
import java.util.stream.*;
public class NestedListExampleStream 
{
	public static void main(String[] args) 
	{
		List<List<String>> a=Arrays.asList(
				Arrays.asList("Reflection", "Collection", "Stream"),
	            Arrays.asList("Structure", "State", "Flow"),
	            Arrays.asList("Sorting", "Mapping", "Reduction", "Stream")
				);
		Set<String> b=new HashSet<>();
		List<String> result=a.stream()
		         .flatMap(List::stream)
		         .filter(n->n.startsWith("S"))
		         .map(String::toUpperCase)
		         .distinct()
		         .sorted()
		         .peek(n->b.add(n))
		         .collect(Collectors.toList());
		System.out.println("HASHSET");
		System.out.println(b);
		System.out.println("Result");
		System.out.println(result);
	}
}

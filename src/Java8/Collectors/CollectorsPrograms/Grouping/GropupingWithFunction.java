package Java8.Collectors.CollectorsPrograms.Grouping;
import java.util.*;
import java.util.stream.*;
import java.util.function.*;
public class GropupingWithFunction 
{
	public static void main(String[] args) 
	{
		List<String> a=new ArrayList<>();
		a.add("Lion");
		a.add("Tiger");
		a.add("Dog");
		a.add("Cat");
		Map<String,List<String>> b=a
		 .stream()
		 .collect(Collectors.groupingBy(Function.identity()));
		System.out.println(b);
	}
}

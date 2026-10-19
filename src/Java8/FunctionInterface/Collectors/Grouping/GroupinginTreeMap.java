package Java8.FunctionInterface.Collectors.Grouping;
import java.util.*;
import java.util.stream.*;
import java.util.function.*;
public class GroupinginTreeMap 
{
	public static void main(String[] args) 
	{
		List<String> a=new ArrayList<>();
		a.add("Lion");
		a.add("Tiger");
		a.add("Dog");
		a.add("Cat");
		Map<String,Long>b =a
		 .stream()
		 .collect(Collectors.groupingBy(Function.identity(),TreeMap::new,Collectors.counting()));
		System.out.println(b);
	}
}

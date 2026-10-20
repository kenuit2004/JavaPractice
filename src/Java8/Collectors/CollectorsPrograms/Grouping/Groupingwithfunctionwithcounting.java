package Java8.Collectors.CollectorsPrograms.Grouping;
import java.util.*;
import java.util.stream.*;
import java.util.function.*;
public class Groupingwithfunctionwithcounting 
{
	public static void main(String[] args) 
	{
		List<Integer> a=new ArrayList<>();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(20);
		a.add(10);
		a.add(10);
		Map<Integer,Long> b=a
		 .stream()
		 .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(b);
	}
}

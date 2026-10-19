package Java8.FunctionInterface.Collectors.Grouping;
import java.util.*;
import java.util.stream.*;
public class GroupingSimpleExample 
{
	public static void main(String[] args) 
	{
		List<Integer> a=new ArrayList<>();
		a.add(10);
		a.add(20);
		a.add(10);
		a.add(30);
		a.add(20);
		a.add(30);
		Map<Integer,Long> b=a
				.stream()
				.collect(Collectors.groupingBy(n->n,Collectors.counting()));
		System.out.println(b);
	}
}

package Java8.FunctionInterface.Stream.IntermediateOperation;
import java.util.*;
public class IntermediateAllMethod 
{
	public static void main(String[] args) 
	{
		List<Integer> a=new ArrayList<>();
		a.add(20);
		a.add(30);
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(20);
		a.add(40);
		a.add(40);
		a.add(40);
		a.add(50);
		a.add(60);
		a.add(60);
		a.stream()
		         .filter(n->n>30)
		         .map(n->n*2)
		         .distinct()
		         .sorted()
		         .forEach(System.out::println);
		         
	}
}

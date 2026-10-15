package Java8.FunctionInterface.Stream.IntermediateOperation.Map;
import java.util.*;
public class IntermediateMap1 
{
	public static void main(String[] args) 
	{
		List<Integer> a=new ArrayList<>();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		a.add(50);
		a.stream()
		         .map(num->num*2)
		         .forEach(System.out::println);
	}
}

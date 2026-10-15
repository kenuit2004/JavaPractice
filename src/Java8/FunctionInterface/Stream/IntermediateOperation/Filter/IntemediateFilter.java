package Java8.FunctionInterface.Stream.IntermediateOperation.Filter;
import java.util.*;
public class IntemediateFilter 
{
	public static void main(String[] args) 
	{
		List<Integer> a=new ArrayList<>();
		a.add(10);
		a.add(15);
		a.add(20);
		a.add(25);
		a.add(30);
		a.stream()
		          .filter(num->num%2==0)
		          .forEach(System.out::println);
		
	}

}

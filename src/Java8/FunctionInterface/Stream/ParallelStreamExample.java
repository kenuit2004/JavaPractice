package Java8.FunctionInterface.Stream;
import java.util.*;
public class ParallelStreamExample 
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
		         .parallel()
		         .forEach(n->System.out.println(Thread.currentThread().getName()));
	}
}

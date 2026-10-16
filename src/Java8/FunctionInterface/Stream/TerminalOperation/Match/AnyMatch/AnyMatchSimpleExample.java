package Java8.FunctionInterface.Stream.TerminalOperation.Match.AnyMatch;
import java.util.*;
public class AnyMatchSimpleExample 
{
	public static void main(String[] args) 
	{
		List<Integer> a=new ArrayList<>();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		a.add(50);
		boolean result=a.stream()
		         .anyMatch(n->n>40);
		System.out.println(result);
	}
}

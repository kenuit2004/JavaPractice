package Java8.FunctionInterface.Stream.TerminalOperation.Match.Allmatch;
import java.util.*;
import java.util.stream.*;
public class AllaMatchSimpleExample 
{
	public static void main(String[] args) 
	{
		List<Integer> a=new ArrayList<>();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		a.add(50);
		Boolean result=a.stream()
		         .allMatch(n->n%10==0);
		System.out.println(result);  
	}

}

package Java8.FunctionInterface;
import java.util.function.Predicate;
import java.util.*;
public class PredicateWithIteration 
{
	public static void main(String[] args) 
	{
		ArrayList<String> a=new ArrayList<>();
		a.add("Coimbator");
		a.add("Chennai");
		a.add("Coorg");
		a.add("Mysore");
		Predicate<String> b=ans->ans.startsWith("C");
		for(String c:a)
		{
			if(b.test(c))
			{
				System.out.println(c);
			}
		}
	}
}

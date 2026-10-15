package Java8.FunctionInterface.Predicate;
import java.util.function.Predicate;
public class PredicateAndMethod 
{
	public static void main(String[] args) 
	{
		Predicate<Integer> a=num->num>5;
		Predicate<Integer> b=n->n>1;
		System.out.println(a.and(b).test(10));
	}

}

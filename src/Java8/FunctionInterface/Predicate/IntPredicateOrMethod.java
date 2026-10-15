package Java8.FunctionInterface.Predicate;
import java.util.function.IntPredicate;
public class IntPredicateOrMethod 
{
	public static void main(String[] args) 
	{
		IntPredicate a=num->num%2==0;
		IntPredicate b=num->num%3==0;
	    System.out.println(a.or(b).test(100));
	}

}

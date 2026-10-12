package Java8.FunctionInterface;
import java.util.function.IntPredicate;
public class IntPredicateAndmethod 
{
	public static void main(String[] args) 
	{
	    IntPredicate a=num->num>10;
	    IntPredicate b=num->num>30;
	    System.out.println(a.and(b).test(20));
	}

}

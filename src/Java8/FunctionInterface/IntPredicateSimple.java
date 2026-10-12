package Java8.FunctionInterface;
import java.util.function.IntPredicate;
public class IntPredicateSimple 
{
	public static void main(String[] args) 
	{
		IntPredicate a=num->num%2==0;
	    System.out.println(a.test(10));
	}

}

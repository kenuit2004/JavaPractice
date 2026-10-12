package Java8.FunctionInterface;
import java.util.function.IntPredicate;
public class IntPredicateTestmethod 
{
	public static void main(String[] args)
	{
		IntPredicate a=num->num%5==0;
	    System.out.println(a.test(100));
	}
}

package Java8.FunctionInterface.Predicate;
import java.util.function.DoublePredicate;
public class DoublePredicateSimple 
{
	public static void main(String[] args) 
	{
		DoublePredicate a=num->num>5;
		System.out.println(a.test(6.0));
	}
}

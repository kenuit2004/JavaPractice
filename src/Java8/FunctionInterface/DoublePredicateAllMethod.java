package Java8.FunctionInterface;
import java.util.function.DoublePredicate;
public class DoublePredicateAllMethod 
{
	public static void main(String[] args) 
	{
		DoublePredicate a=num->num%2==0;
		DoublePredicate b=num->num%3==0;
		System.out.println(a.test(100));
		System.out.println(a.and(b).test(100));
		System.out.println(a.or(b).test(100));
		System.out.println(a.negate().test(100));
		System.out.println(b.negate().test(100));
	}
}

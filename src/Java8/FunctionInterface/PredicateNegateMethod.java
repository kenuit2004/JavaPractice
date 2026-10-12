package Java8.FunctionInterface;
import java.util.function.Predicate;
public class PredicateNegateMethod 
{
	public static void main(String[] args) 
	{
		Predicate<Integer> a=num->num>500;
		System.out.println(a.negate().test(100));
	}

}

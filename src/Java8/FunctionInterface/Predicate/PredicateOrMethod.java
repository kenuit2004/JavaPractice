package Java8.FunctionInterface.Predicate;
import java.util.function.Predicate;
public class PredicateOrMethod 
{
	public static void main(String[] args) 
	{
		Predicate<Integer> a=num->num>50;
		Predicate<Integer> b=n->n>200;
		System.out.println(a.or(b).test(100));
	}

}

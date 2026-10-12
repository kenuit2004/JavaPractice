package Java8.FunctionInterface;
import java.util.function.Predicate;
public class PredicateSimpleProgram 
{
	public static void main(String[] args) 
	{
		Predicate<Integer> a=num->num%2==0;
		System.out.println(a.test(20));
	}
}
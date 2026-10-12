package Java8.FunctionInterface;
import java.util.function.Predicate;
public class PredicateTestMethod 
{
	public static void main(String[] args) 
	{
		Predicate<String> a=name->name.isEmpty();
	    System.out.println(a.test(""));
	}
}

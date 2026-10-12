package Java8.FunctionInterface;
import java.util.function.Predicate;
public class PredicateIsEqualMethod 
{
	public static void main(String[] args) 
	{
		Predicate<String> a=Predicate.isEqual("Kenuit");
		System.out.println(a.test("Kenuit"));
	}
}
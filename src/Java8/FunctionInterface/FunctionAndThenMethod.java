package Java8.FunctionInterface;
import java.util.function.Function;
public class FunctionAndThenMethod 
{
	public static void main(String[] args) 
	{
		Function<Integer,Double> a=num->num/2.0;
		a=a.andThen(num->num*2);
		System.out.println(a.apply(50));
	}
}
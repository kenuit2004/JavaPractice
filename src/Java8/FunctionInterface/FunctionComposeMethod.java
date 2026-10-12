package Java8.FunctionInterface;
import java.util.function.Function;
public class FunctionComposeMethod 
{
	public static void main(String[] args) 
	{
		Function<Integer,Double> a=num->num/4.0;
		a=a.compose(num->num*2);
		System.out.println(a.apply(100));
	}
}

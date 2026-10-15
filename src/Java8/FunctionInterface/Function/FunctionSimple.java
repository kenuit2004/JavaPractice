package Java8.FunctionInterface.Function;
import java.util.function.Function;
public class FunctionSimple 
{
	public static void main(String[] args) 
	{
		Function<Integer,Double> a=num->num/2.0;
		System.out.println(a.apply(40));
	}
}

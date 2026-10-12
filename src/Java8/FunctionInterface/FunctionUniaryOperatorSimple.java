package Java8.FunctionInterface;
import java.util.function.UnaryOperator;
public class FunctionUniaryOperatorSimple 
{
	public static void main(String[] args) 
	{
		UnaryOperator<Integer> a=num->num;
		System.out.println(a.apply(10));
	}
}

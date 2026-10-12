package Java8.FunctionInterface;
import java.util.function.UnaryOperator;
public class FunctionUnaryOperatorandThenMethod 
{
	public static void main(String[] args) 
	{
		UnaryOperator<Integer> a=num->num+20;
		UnaryOperator<Integer> b=num->num+100;
		System.out.println(a.andThen(b).apply(20));
	}
}

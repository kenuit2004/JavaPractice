package Java8.FunctionInterface;
import java.util.function.UnaryOperator;
public class FunctionUnaryOperatorCompose 
{
	public static void main(String[] args) 
	{
		UnaryOperator<Integer> a=num->num+10;
		UnaryOperator<Integer> b=num->num*100;
		System.out.println(a.compose(b).apply(10));		
	}
}

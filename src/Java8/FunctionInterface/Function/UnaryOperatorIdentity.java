package Java8.FunctionInterface.Function;
import java.util.function.UnaryOperator;
public class UnaryOperatorIdentity 
{
	public static void main(String[] args) 
	{
		UnaryOperator<String> a=UnaryOperator.identity();
		System.out.println(a.apply("Kenuit"));
	}
}

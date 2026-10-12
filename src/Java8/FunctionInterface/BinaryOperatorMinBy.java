package Java8.FunctionInterface;
import java.util.function.BinaryOperator;
public class BinaryOperatorMinBy 
{
	public static void main(String[] args) 
	{
		BinaryOperator<Integer> a=BinaryOperator.minBy((x,y)->(x>y)?1:(x==y)?0:-1);
		System.out.println(a.apply(200, 100));
	}
}

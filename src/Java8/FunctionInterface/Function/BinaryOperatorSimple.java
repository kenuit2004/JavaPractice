package Java8.FunctionInterface.Function;
import java.util.function.BinaryOperator;
public class BinaryOperatorSimple 
{
	public static void main(String[] args) 
	{
		BinaryOperator<Integer> a=(x,y)->x+y;
		System.out.println(a.apply(10,30));
	}
}

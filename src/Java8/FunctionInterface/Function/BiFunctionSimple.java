package Java8.FunctionInterface.Function;
import java.util.function.BiFunction;
public class BiFunctionSimple 
{
	public static void main(String[] args) 
	{
		BiFunction<Integer,Integer,Integer> a=(x,y)->x*y;
		System.out.println(a.apply(10,5));
	}
}

package Java8.FunctionInterface;
import java.util.function.BiFunction;
public class BiFunctionandThenMethod 
{
	public static void main(String[] args) 
	{
		BiFunction<Integer,Integer,Integer> a=(x,y)->x*y;
		a=a.andThen(num->num+50);
	    System.out.println(a.apply(10,30));
	}
}

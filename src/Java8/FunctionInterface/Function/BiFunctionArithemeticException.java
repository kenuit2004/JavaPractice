package Java8.FunctionInterface.Function;
import java.util.function.BiFunction;
public class BiFunctionArithemeticException 
{
	public static void main(String[] args) 
	{
		BiFunction<Integer,Integer,Integer> a=(x,y)->x*y;
		try
		{
			a=a.andThen(num->num/(num-300));
		    System.out.println(a.apply(10,30));
		}
		catch(Exception e)
		{
			System.out.println("Error:"+e);
		}
	}
}

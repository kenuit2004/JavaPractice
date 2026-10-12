package Java8.FunctionInterface;
import java.util.function.Function;
public class FunctionandThenNullPointer 
{
	public static void main(String[] args) 
	{
		Function<Integer,Double> a=num->num/2.0;
		try
		{
			a=a.andThen(null);
			System.out.println(a.apply(100));
		}
		catch(Exception e)
		{
			System.out.println("Error:"+e);
		}
	}
}

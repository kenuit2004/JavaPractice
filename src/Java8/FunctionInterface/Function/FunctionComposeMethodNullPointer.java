package Java8.FunctionInterface.Function;
import java.util.function.Function;
public class FunctionComposeMethodNullPointer 
{
	public static void main(String[] args) 
	{
		Function<Integer,Double> a=num->num/4.0;
		try
		{
			a=a.compose(null);
			System.out.println(a.apply(100));
		}
		catch(Exception e)
		{
			System.out.println("Error:"+e);
		}
	}
}


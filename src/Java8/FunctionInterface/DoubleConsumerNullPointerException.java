package Java8.FunctionInterface;
import java.util.function.DoubleConsumer;
public class DoubleConsumerNullPointerException 
{
	public static void main(String[] args) 
	{
		try
		{
			DoubleConsumer a=num->System.out.println(num);
		    a.andThen(null).accept(10);
		}
		catch(Exception e)
		{
			System.out.println("Error:"+e);
		}
	}
}

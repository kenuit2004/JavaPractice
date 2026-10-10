package Java8.FunctionInterface;
import java.util.function.LongConsumer;
public class LongConsumerNulPointerException 
{
	public static void main(String[] args) 
	{
		try
		{
			LongConsumer a=num->System.out.println(num);
		    a.andThen(null).accept(10L);
		}
		catch(Exception e)
		{
			System.out.println("Error:"+e);
		}
	}
}

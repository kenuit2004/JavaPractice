package Java8.FunctionInterface;
import java.util.function.LongConsumer;
public class LongConsumerAithemeticException 
{
	public static void main(String[] args) 
	{
		try
		{
			LongConsumer a=num->System.out.println(num);
			LongConsumer b=n->System.out.println(n/(n-10));
			a.andThen(b).accept(10L);
		}
		catch(Exception e)
		{
			System.out.println("Error:"+e);
		}
	}
}

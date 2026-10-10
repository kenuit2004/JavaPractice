package Java8.FunctionInterface;
import java.util.function.IntConsumer;
public class IntConsumerArithemeticException 
{
	public static void main(String[] args) 
	{
		try
		{
			IntConsumer a=num->System.out.println(num*10);
			IntConsumer b=n->System.out.println(n/(n-10));
		    a.andThen(b).accept(10);
		}
		catch(Exception e)
		{
			System.out.println("Error:"+e);
		}
	}
}

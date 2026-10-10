package Java8.FunctionInterface;
import java.util.function.IntConsumer;
public class IntConsumerWithandThenNull 
{
	public static void main(String[] args) 
	{
		try
		{
			IntConsumer a=num->System.out.println(num);
			a.andThen(null).accept(10);
		}
		catch(Exception e)
		{
			System.out.println("Error:"+e);
		}
	}
}

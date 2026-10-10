package Java8.FunctionInterface;
import java.util.function.DoubleConsumer;
public class DoubleConsumerNumberFormat 
{
	public static void main(String[] args) 
	{
		try
		{
			DoubleConsumer a=num->System.out.println(Integer.parseInt(Double.toString(num)));
			DoubleConsumer b=n->System.out.println(n);
			b.andThen(a).accept(10.0);
		}
		catch(Exception e)
		{
			System.out.println("Error:"+e);
		}
	}
}

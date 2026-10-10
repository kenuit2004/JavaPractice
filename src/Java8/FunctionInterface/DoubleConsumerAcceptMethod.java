package Java8.FunctionInterface;
import java.util.function.DoubleConsumer;
public class DoubleConsumerAcceptMethod 
{
	public static void main(String[] args) 
	{
		DoubleConsumer a=num->System.out.println(num);
	    a.accept(5);
	}
}
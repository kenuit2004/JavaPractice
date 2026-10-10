package Java8.FunctionInterface;
import java.util.function.LongConsumer;
public class LongConsumerAndThenMethod 
{
	public static void main(String[] args) 
	{
		LongConsumer a=num->System.out.println(num*2);
		LongConsumer b=n->System.out.println(n*3);
	    a.andThen(b).accept(10L);
	}
}

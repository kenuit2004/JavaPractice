package Java8.FunctionInterface;
import java.util.function.DoubleConsumer;
public class DoubleConsumerandThenMethod 
{
	public static void main(String[] args) 
	{
		DoubleConsumer a=num->System.out.println(num*10);
		DoubleConsumer b=n->System.out.println(n*3);
		a.andThen(b).accept(2);
	}
}

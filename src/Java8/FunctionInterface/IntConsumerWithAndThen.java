package Java8.FunctionInterface;
import java.util.function.IntConsumer;
public class IntConsumerWithAndThen 
{
	public static void main(String[] args) 
	{
		IntConsumer a=num->System.out.println(num*2);
		IntConsumer b=n->System.out.println(n);
		a.andThen(b).accept(10);
	}
}

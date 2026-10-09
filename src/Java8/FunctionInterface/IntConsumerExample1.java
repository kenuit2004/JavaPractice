package Java8.FunctionInterface;
import java.util.function.IntConsumer;
public class IntConsumerExample1 
{
	public static void main(String[] args)
	{
		IntConsumer a=num->System.out.println(num*num);
		a.accept(10);
	}
}
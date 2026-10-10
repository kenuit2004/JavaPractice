package Java8.FunctionInterface;
import java.util.function.LongConsumer;
public class SimpleLongConsumer 
{
	public static void main(String[] args) 
	{
		LongConsumer a=num->System.out.println(num);
		a.accept(10L);
	}
}

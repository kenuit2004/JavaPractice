package Java8.FunctionInterface;
import java.util.function.DoubleConsumer;
public class SimpleDoubleConsumer 
{
	public static void main(String[] args) 
	{
		DoubleConsumer a=num->System.out.println(3.14*num*num);
		a.accept(12.34);
	}
}

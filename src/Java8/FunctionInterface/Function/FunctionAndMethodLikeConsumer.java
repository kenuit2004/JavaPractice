package Java8.FunctionInterface.Function;
import java.util.function.Function;
public class FunctionAndMethodLikeConsumer 
{
	public static void main(String[] args)
	{
		Function<Integer,Integer> a=num->num+10;
		Function<Integer,Integer> b=num->num+50;
		System.out.println(a.andThen(b).apply(10));
	}
}

package Java8.FunctionInterface;
import java.util.function.Function;
public class FunctionIdentityMethod 
{
	public static void main(String[] args) 
	{
		Function<String,String> a=Function.identity();
		System.out.println(a.apply("Kenuit"));
	}
}

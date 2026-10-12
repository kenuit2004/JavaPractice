package Java8.FunctionInterface;
import java.util.function.IntPredicate;
public class IntpredicateNeglatemethod 
{
	public static void main(String[] args) 
	{
		IntPredicate a=num->num%3==0;
	    System.out.println(a.negate().test(200));
	}

}

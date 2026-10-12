package Java8.FunctionInterface;
import java.util.function.BiPredicate;
public class BiPredicateExample 
{
	public static void main(String[] args) 
	{
		BiPredicate<Integer,String> a=(x,y)->{
			if(x==Integer.parseInt(y))
			{
				return true;
			}
			return false;
		};
		System.out.println(a.test(10, "10"));
		BiPredicate<Integer,String> b=(x,y)->{
			if(x>Integer.parseInt(y))
			{
				return true;
			}
			return false;
		};
		System.out.println(b.test(20, "10"));
		System.out.println(a.and(b).test(10, "10"));
		System.out.println(a.or(b).test(10, "10"));
		System.out.println((b.negate().test(10, "10")));
		
		
	}
}

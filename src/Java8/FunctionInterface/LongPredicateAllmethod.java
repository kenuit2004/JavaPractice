package Java8.FunctionInterface;
import java.util.function.LongPredicate;
public class LongPredicateAllmethod 
{
	public static void main(String[] args) 
	{
		LongPredicate a=num->{
			return num==100L;
		};
		System.out.println(a.test(100L));
		LongPredicate b=num->{
			return num<100L;
		};
		System.out.println(a.and(b).test(100L));
		System.out.println(a.or(b).test(100L));
		System.out.println(b.negate().test(100L));
	}
}

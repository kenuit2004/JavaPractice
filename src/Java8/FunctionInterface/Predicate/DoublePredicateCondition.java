package Java8.FunctionInterface.Predicate;
import java.util.function.DoublePredicate;
public class DoublePredicateCondition 
{
	public static void main(String[] args) 
	{
		DoublePredicate a=num->{
			return num>50;
		};
	    System.out.println(a.test(100));
	    DoublePredicate b=num->{
	    	double y=num*2;
	    	return y<500;
	    };
	    System.out.println(a.and(b).test(200));
	}
}

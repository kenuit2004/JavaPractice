package Java8.FunctionInterface.Stream.TerminalOperation.Count;
import java.util.stream.*;
public class CountSimpleExample 
{
	public static void main(String[] args) 
	{
		IntStream a=IntStream.of(1,2,3,4,5,6,7,8,9,10);
		long result=a.count();
		System.out.println(result);
	}
}

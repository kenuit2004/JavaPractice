package Java8.FunctionInterface.Stream.TerminalOperation.Reduce;
import java.util.stream.*;
import java.util.*;
public class ReduceSimpleExample 
{
	public static void main(String[] args) 
	{
		IntStream a=IntStream.of(10,20,30,40,50);
		OptionalInt b=a.reduce(Integer::sum);
		if(b.isPresent())
		{
			System.out.println(b.getAsInt());
		}
		else
		{
			System.out.println("Not Found");
		}
	}
}

package Java8.FunctionInterface.Stream.TerminalOperation.Reduce;
import java.util.stream.*;
import java.util.*;
public class ReduceSimpleExampleWithMultiple 
{
	public static void main(String[] args) 
	{
		IntStream a=IntStream.of(10,20,30,40);
		OptionalInt b=a.reduce((x,y)->(x*y));
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

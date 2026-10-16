package Java8.FunctionInterface.Stream.TerminalOperation.Find.FindAny;
import java.util.stream.*;
import java.util.*;
public class FindAnyWithParallel 
{
	public static void main(String[] args) 
	{
		IntStream a=IntStream.of(4, 5, 8, 10, 12, 16);
		a=a
		 .parallel()
		 .filter(n->n%4==0);
		OptionalInt c=a.findAny();
		if(c.isPresent())
		{
			System.out.println(c.getAsInt());
		}
		else
		{
			System.out.println("Not Found");
		}
	}
}

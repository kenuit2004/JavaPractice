package Java8.FunctionInterface.Stream.TerminalOperation.ForEach;
import java.util.stream.*;
public class ForEachSimpleExample 
{
	public static void main(String[] args) 
	{
		IntStream a=IntStream.of(1,2,3,4,5);
		a.forEach(System.out::println);
	}
}

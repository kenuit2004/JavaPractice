package Java8.FunctionInterface.Stream.StreamCreation.UsingStreamGenerate;
import java.util.stream.*;
public class IntStreamGenerateExample 
{
	public static void main(String[] args) 
	{
		IntStream a=IntStream.generate(()->(int)(Math.random()*10));
		a
		 .limit(5)
		 .forEach(System.out::println);
	}
}

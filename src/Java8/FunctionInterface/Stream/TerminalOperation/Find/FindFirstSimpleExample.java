package Java8.FunctionInterface.Stream.TerminalOperation.Find;
import java.util.*;
import java.util.stream.*;
public class FindFirstSimpleExample 
{
	public static void main(String[] args) 
	{
		List<String> a=new ArrayList<>();
		a.add("Lion");
		a.add("Tiger");
		a.add("Dog");
		a.add("Cat");
		Stream<String> b=a.stream();
		Optional<String> c=b.findFirst();
		if(c.isPresent())
		{
			System.out.println(c.get());
		}
		else
		{
			System.out.println("Not Found");
		}
	}
}

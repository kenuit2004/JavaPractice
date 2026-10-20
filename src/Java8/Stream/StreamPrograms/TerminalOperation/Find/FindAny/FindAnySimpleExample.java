package Java8.Stream.StreamPrograms.TerminalOperation.Find.FindAny;
import java.util.*;
import java.util.stream.*;
public class FindAnySimpleExample 
{
	public static void main(String[] args) 
	{
		List<String> a=new ArrayList<>();
		a.add("Lion");
		a.add("Tiger");
		a.add("Dog");
		a.add("Cat");
		Stream<String> b=a.stream();
		Optional<String> c=b.findAny();
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

package Java8.FunctionInterface.Stream;
import java.util.*;
import java.util.regex.*;
public class StreamWithPatternPredicate 
{
	static void ken(List<String> list,Pattern a)
	{
		list.stream()
		            .filter(a.asPredicate())
		            .forEach(System.out::println);
	}
	public static void main(String[] args)
	{
		List<String> a=new ArrayList<>();
		a.add("Lion");
		a.add("Tiger");
		a.add("Log");
		a.add("Cat");
		Pattern b=Pattern.compile("^L");
		ken(a,b);
	}
}

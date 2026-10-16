package Java8.FunctionInterface.Stream.TerminalOperation.Match.NoneMatch;
import java.util.*;
public class NoneMatchSimpleExample 
{
	public static void main(String[] args)
	{
		List<String> a=new ArrayList<>();
		a.add("HTML");
		a.add("CSS");
		a.add("Javascript");
		a.add("React");
		a.add("Git");
		a.add("SQL");
		a.add("DSA");
		boolean b=a.stream()
		          .noneMatch(str->str.length()==1);
		System.out.println(b);
	}
}

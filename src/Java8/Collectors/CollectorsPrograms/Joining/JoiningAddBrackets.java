package Java8.Collectors.CollectorsPrograms.Joining;
import java.util.*;
import java.util.stream.*;
public class JoiningAddBrackets 
{
	public static void main(String[] args) 
	{
		List<Character> a=new ArrayList<>();
		a.add('K');
		a.add('E');
		a.add('N');
		a.add('U');
		a.add('I');
		a.add('T');
		String b=a
		 .stream()
		 .map(String::valueOf)
		 .collect(Collectors.joining(",","[","]"));
		System.out.println(b);
	}
}

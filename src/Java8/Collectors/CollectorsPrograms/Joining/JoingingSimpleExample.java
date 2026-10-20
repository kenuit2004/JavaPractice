package Java8.Collectors.CollectorsPrograms.Joining;
import java.util.*;
import java.util.stream.*;
public class JoingingSimpleExample 
{
	public static void main(String[] args) 
	{
		char a[]= {'K','E','N','U','I','T'};
		String b=Stream.of(a).map(String::new).collect(Collectors.joining());
		System.out.println(b);
	}
}

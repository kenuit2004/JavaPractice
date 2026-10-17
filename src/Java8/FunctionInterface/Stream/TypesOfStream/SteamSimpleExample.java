package Java8.FunctionInterface.Stream.TypesOfStream;
import java.util.*;
public class SteamSimpleExample 
{
	public static void main(String[] args) 
	{
		List<String> a=new ArrayList<>();
		a.add("Lion");
		a.add("Tiger");
		a.add("Dog");
		a.add("Lat");
		System.out.println("All Names");
		a.forEach(System.out::println);
		System.out.println("Names Starts with L");
		a.stream()
		         .filter(n->n.startsWith("L"))
		         .map(n->n.toUpperCase())
		         .forEach(System.out::println);
	}
}
package Java8.MethodReference.MethodReferencePrograms;
import java.util.*;
public class MethodReferenceStream 
{
	public static void main(String[] args) 
	{
		List<String> a=new ArrayList<>();
		a.add("Chennai");
		a.add("Coimbatore");
		a.add("Madurai");
		a.add("Ooty");
		a.add("Erode");
		a.stream()
		         .map(String::toUpperCase)
		         .forEach(System.out::println);
	}
}
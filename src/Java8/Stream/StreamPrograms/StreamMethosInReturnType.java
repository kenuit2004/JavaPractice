package Java8.Stream.StreamPrograms;
import java.util.*;
public class StreamMethosInReturnType 
{
	public static void main(String[] args) 
	{
		List<String> a=new ArrayList<>();
		a.add("Aman");
		a.add("Sita");
		a.add("Ram");
		a.add("Sam");
		Optional<String> b=a.stream()
		         .filter(n->{
		        	 System.out.println("Filtering:"+n);
		        	 return n.startsWith("S");
		         })
		         .map(n->{
		        	 System.out.println("Mapping:"+n);
		        	 return n.toUpperCase();
		         })
		         .findFirst();
		System.out.println(b.orElse("Non"));
	}
}

package Java8.Optional.OptionalPrograms.of;
import java.util.*;
public class OptionalofExample 
{
	public static void main(String[] args) 
	{
		Optional<Integer> a=Optional.of(12345);
		System.out.println(a);
		System.out.println(a.get());
	}

}

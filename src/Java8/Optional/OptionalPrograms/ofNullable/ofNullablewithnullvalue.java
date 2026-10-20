package Java8.Optional.OptionalPrograms.ofNullable;
import java.util.*;
public class ofNullablewithnullvalue 
{
	public static void main(String[] args) 
	{
		Optional<Integer> a=Optional.ofNullable(null);
		System.out.println(a);
	}
}

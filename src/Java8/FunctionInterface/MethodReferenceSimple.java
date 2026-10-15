package Java8.FunctionInterface;
import java.util.*;
public class MethodReferenceSimple 
{
	static void ken(String name)
	{
		System.out.println(name);
	}
	public static void main(String[] args) 
	{
		String a[]= {"Lion","Tiger","Dog","Cat"};
		Arrays.stream(a).forEach(MethodReferenceSimple::ken);
	}
}
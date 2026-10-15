package Java8.FunctionInterface.MethodReference;
import java.util.*;
class Kenn
{
	Kenn()
	{
		
	}
	void show(String name)
	{
		System.out.println(name);
	}
}
public class MethodReferenceOOPS 
{
	public static void main(String[] args) 
	{
		List<String> a=new ArrayList<>();
		a.add("Lion");
		a.add("Tiger");
		a.add("Dog");
		a.add("Cat");
		Kenn b=new Kenn();
		a.forEach(b::show);
	}
}
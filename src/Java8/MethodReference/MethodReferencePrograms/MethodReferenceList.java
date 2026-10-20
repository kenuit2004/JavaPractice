package Java8.MethodReference.MethodReferencePrograms;
import java.util.*;
class Ani
{
	static void ken(int name)
	{
		System.out.println(name);
	}
}
public class MethodReferenceList 
{
	public static void main(String[] args) 
	{
		List<Integer> a=new ArrayList<>();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		a.add(50);
		a.forEach(Ani::ken);
	}
}

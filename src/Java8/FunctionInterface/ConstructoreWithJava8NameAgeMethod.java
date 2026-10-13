package Java8.FunctionInterface;
import java.util.*;
class Damm
{
	String name;
	int age;
	Damm(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	public String getName()
	{
		return name;
	}
	public int getAge()
	{
		return age;
	}
	public String toString()
	{
		return name+" "+age;
	}
}
public class ConstructoreWithJava8NameAgeMethod 
{
	public static void main(String[] args) 
	{
		List<Damm> a=new ArrayList<>();
		a.add(new Damm("Lion",25));
		a.add(new Damm("Cat",10));
		a.add(new Damm("Goat",15));
		a.add(new Damm("Lion",20));
	    System.out.println("Before Sorting");
		for(Damm b:a)
		{
			System.out.println(b);
		}
		a.sort(Comparator.comparing(Damm::getName).thenComparing(Damm::getAge));
		System.out.println("After Sorting");
		for(Damm b:a)
		{
			System.out.println(b);
		}
	}
}

package Java8.FunctionInterface;
import java.util.*;
class Dam
{
	String name;
	int age;
	Dam(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	public String toString()
	{
		return name+" "+age;
	}
}
class Studentt implements Comparator<Dam>
{
	public int compare(Dam a,Dam b)
	{
		int namecomp=a.name.compareTo(b.name);
		int agecomp=Integer.compare(a.age,b.age);
		return (namecomp==0)?agecomp:namecomp;
	}
}
public class ComparatorWithNameAge 
{
	public static void main(String[] args) 
	{
		List<Dam> a=new ArrayList<>();
		a.add(new Dam("Lion",25));
		a.add(new Dam("Cat",10));
		a.add(new Dam("Goat",15));
		a.add(new Dam("Lion",20));
	    System.out.println("Before Sorting");
		for(Dam b:a)
		{
			System.out.println(b);
		}
		Collections.sort(a,new Studentt());
		System.out.println("After Sorting");
		for(Dam b:a)
		{
			System.out.println(b);
		}
	}
}

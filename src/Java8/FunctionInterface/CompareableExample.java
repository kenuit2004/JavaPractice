package Java8.FunctionInterface;
import java.util.*;
class Student implements Comparable<Student>
{
	String name;
	int age;
	Student(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	public int compareTo(Student other)
	{
		if(other==null)
		{
			throw new NullPointerException("Cannot Compare with Null");
		}
		return Integer.compare(this.age,other.age);
	}
	public String toString()
	{
		return name+" "+age;
	}
}
public class CompareableExample 
{
	public static void main(String[] args) 
	{
		List<Student> name=new ArrayList<>();
		name.add(new Student("Lion",3));
		name.add(new Student("Tiger",4));
		name.add(new Student("Dog",1));
		name.add(new Student("Cat",2));
		Collections.sort(name);
		System.out.println(name);
	}
}
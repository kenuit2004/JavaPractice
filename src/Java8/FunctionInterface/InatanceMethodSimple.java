package Java8.FunctionInterface;
import java.util.*;
class Game
{
	String name;
	int age;
	Game(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	public boolean equals(Object obj)
	{
		if(obj==this)
		{
			return true;
		}
		if(obj==null || obj.getClass()!=this.getClass())
		{
			return false;
		}
		Game emp=(Game)obj;
		return (emp.name.equals(this.name) && emp.age==this.age);
	}
	public int hashCode()
	{
		return Objects.hash(name,age);
	}
}
public class InatanceMethodSimple 
{
	public static void main(String[] args) 
	{
		Game a=new Game("Lion",10);
		Game b=new Game("Lion",10);
		if(a.hashCode()==b.hashCode())
		{
			if(a.equals(b))
			{
				System.out.println("Both are Equal");
			}
			else
			{
				System.out.println("Both are not Equal");
			}
		}
	}
}
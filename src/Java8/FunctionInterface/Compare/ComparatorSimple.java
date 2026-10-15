package Java8.FunctionInterface.Compare;
import java.util.*;
class Home
{
    String name;
    int age;
    Home(String name,int age)
    {
        this.name=name;
        this.age=age;
    }
    public String toString()
    {
        return name+" "+age;
    }
}
public class ComparatorSimple 
{
	public static void main(String[] args) 
	{
		List<Home> a=new ArrayList<>();
        a.add(new Home("Lion",20));
        a.add(new Home("Tiger",10));
        Collections.sort(a,(x,y)->Integer.compare(x.age,y.age));
        for(Home b:a)
        {
            System.out.println(b);
        }
	}
}

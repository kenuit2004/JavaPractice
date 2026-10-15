package Java8.FunctionInterface.Function;
import java.util.function.Function;
class Details
{
	String name;
	int age;
	Details(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
}
public class FunctionOOPS 
{
	public static void main(String[] args) 
	{
		Function<Details,String> emp=det->"Welcome! "+det.name;
		Details a=new Details("Kenuit",22);
		System.out.println(emp.apply(a));
		
	}
}
package Java8.FunctionInterface;
import java.util.*;
class Parent
{
	
}
class Child extends Parent
{
	
}
public class InstanceSimple 
{
	public static void main(String[] args) 
	{
		Child a=new Child();
		if(a instanceof Child)
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
		if(a instanceof Parent)
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
		if(a instanceof Object)
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
		
	}
}

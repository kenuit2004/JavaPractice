import java.util.*;
class Details
{
	String name;
	int age;
	Details(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	void disp()
	{
		System.out.println(name+" "+age);
	}
}
class Student
{
	public static void main(String[] args)
	{
		Details a=new Details("Kenuit",22);
		a.disp();
	}
}
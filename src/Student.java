import java.util.*;
class Details
{
	String name;
	int age;
	String place;
	Details(String name,int age,String place)
	{
		this.name=name;
		this.age=age;
		this.place=place;
	}
	void disp()
	{
		System.out.println(name+" "+age+" "+place);
	}
}
class Student
{
	public static void main(String[] args)
	{
		Details a=new Details("Kenuit",22,"Coimbatore");
		a.disp();
	}
}
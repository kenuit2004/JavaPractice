package Java8.FunctionInterface;
import java.util.*;
import java.util.function.Predicate;
class User
{
	String name,role;
	User(String name,String role)
	{
		this.name=name;
		this.role=role;
	}
	public String getRole()
	{
		return role;
	}
	public String toString()
	{
		return name+" "+role;
	}
}
public class PredicateOOPs 
{
	static List<User> ken(List<User> user,Predicate<User> predicate)
	{
		List<User> result=new ArrayList<>();
		for(User emp:user)
		{
			if(predicate.test(emp))
			{
				result.add(emp);
			}
		}
		return result;
	}
	public static void main(String[] args)
	{
		List<User> user=new ArrayList<>();
		user.add(new User("Lion","IT"));
		user.add(new User("Tiger","Mech"));
		System.out.println(ken(user,u->u.getRole().equals("IT")));
	}
}
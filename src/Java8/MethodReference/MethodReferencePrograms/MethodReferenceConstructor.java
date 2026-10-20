package Java8.MethodReference.MethodReferencePrograms;
import java.util.function.Supplier;
class Stu
{
	Stu()
	{
		System.out.println("Kenuit");
	}
}
public class MethodReferenceConstructor 
{
	public static void main(String[] args)
	{
		Supplier<Stu> a=Stu::new;
		a.get();
	}
}

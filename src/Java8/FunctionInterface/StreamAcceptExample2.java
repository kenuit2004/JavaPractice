package Java8.FunctionInterface;
import java.util.stream.Stream;
public class StreamAcceptExample2 
{
	public static void main(String[] args) 
	{
		Stream.Builder<String> a=Stream.builder();
		a.accept("Lion");
		a.accept("Tiger");
		a.accept("Dog");
		a.accept("Cat");
		Stream<String> b=a.build();
		b.forEach(System.out::println);
		try
		{
			a.accept("Fish");
		}
		catch(Exception e)
		{
			System.out.println("Error:"+e);
		}
	}
}
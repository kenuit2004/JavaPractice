package Java8.FunctionInterface.Stream;
import java.util.stream.Stream;
public class StreamCollectionUsingOfExample2 
{
	static void ken()
	{
		Stream<Integer> a=Stream.of(1,2,3,4,5,6,7,8,9,10);
		a.forEach(System.out::println);
	}
	public static void main(String[] args) 
	{
		ken();
	}
}

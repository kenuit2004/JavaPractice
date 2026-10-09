package Java8.FunctionInterface;
import java.util.stream.Stream;
class StreamAcceptExample1
{
	public static void main(String[] args)
	{
		Stream.Builder<String> a=Stream.builder();
		a.accept("Lion");
		a.accept("Tiger");
		a.accept("Dog");
		a.accept("Cat");
		Stream<String> b=a.build();
		System.out.println("Welcome To Animal kindom");
		b.forEach(System.out::println);
	}
}

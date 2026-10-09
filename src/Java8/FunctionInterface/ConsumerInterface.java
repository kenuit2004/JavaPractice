package Java8.FunctionInterface;
import java.util.function.Consumer;
class ConsumerInterface
{
	public static void main(String[] args)
	{
		Consumer<String> a=name->System.out.println("Welcome "+name);
		a.accept("Kenuit");
	}
}

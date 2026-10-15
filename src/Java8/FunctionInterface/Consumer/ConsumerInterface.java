package Java8.FunctionInterface.Consumer;
import java.util.function.Consumer;
class ConsumerInterface
{
	public static void main(String[] args)
	{
		Consumer<String> a=name->System.out.println("Welcome "+name);
		a.accept("Kenuit");
	}
}

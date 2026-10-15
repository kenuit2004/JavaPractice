package Java8.FunctionInterface.Supplier;
import java.util.function.Supplier;
public class SupplierSimple 
{
	public static void main(String[] args) 
	{
		Supplier<String> a=()->"Welcome Kenuit";
		System.out.println(a.get());;
	}
}

package Java8.FunctionInterface.Supplier;
import java.util.function.BooleanSupplier;
public class BooleanSupplierSimple 
{
	public static void main(String[] args) 
	{
		BooleanSupplier a=()->true;
		System.out.println(a.getAsBoolean());
	}
}

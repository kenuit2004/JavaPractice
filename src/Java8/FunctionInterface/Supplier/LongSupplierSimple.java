package Java8.FunctionInterface.Supplier;
import java.util.function.LongSupplier;
public class LongSupplierSimple 
{
	public static void main(String[] args) 
	{
		LongSupplier a=()->System.currentTimeMillis();
		System.out.println(a.getAsLong());
	}
}

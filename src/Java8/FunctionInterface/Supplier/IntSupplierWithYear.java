package Java8.FunctionInterface.Supplier;
import java.util.function.IntSupplier;
import java.time.Year;
public class IntSupplierWithYear 
{
	public static void main(String[] args) 
	{
		IntSupplier a=()->Year.now().getValue();
		System.out.println(a.getAsInt());		
	}
}
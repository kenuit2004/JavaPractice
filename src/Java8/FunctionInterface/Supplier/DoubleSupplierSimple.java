package Java8.FunctionInterface.Supplier;
import java.util.function.DoubleSupplier;
public class DoubleSupplierSimple 
{
	public static void main(String[] args) 
	{
		DoubleSupplier a=()->Math.random();
	    System.out.println(a.getAsDouble());
		
	}
}

package Java8.FunctionInterface;
import java.util.function.IntSupplier;
public class IntSupplierSimple 
{
	public static void main(String[] args) 
	{
		IntSupplier a=()->(int)(Math.random()*100);
		System.out.println(a.getAsInt());
	}
}
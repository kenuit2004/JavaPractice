package Java8.FunctionInterface.Function;
public class SimpleFunctionalInterfacewithThread 
{
	public static void main(String[] args) 
	{
		new Thread(()->System.out.println("Running")).start();
	}
}

package Java8.FunctionInterface;
interface Kenuit
{
	void show();
}
class SimpleFunctionalInterface 
{
	public static void main(String[] args)
	{
		Kenuit a=()->System.out.println("Welcome Kenuit");
		a.show();
	}
}

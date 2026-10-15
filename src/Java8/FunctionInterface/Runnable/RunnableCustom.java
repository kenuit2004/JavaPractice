package Java8.FunctionInterface.Runnable;
class Animal implements Runnable
{
	public void run()
	{
		System.out.println("Welcome Kenuit");
	}
}
public class RunnableCustom 
{
	public static void main(String[] args) 
	{
		Animal a=new Animal();
		Thread t=new Thread(a);
		t.start();
	}
}

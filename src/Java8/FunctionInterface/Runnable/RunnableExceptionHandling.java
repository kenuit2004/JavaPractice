package Java8.FunctionInterface.Runnable;
class Kenuity implements Runnable
{
	public void run()
	{
		try
		{
			int result=10/0;
			System.out.println(result);
		}
		catch(Exception e)
		{
			System.out.println("Error:"+e);
		}
	}
}
public class RunnableExceptionHandling 
{
	public static void main(String[] args) 
	{
		Kenuity a=new Kenuity();
		Thread t=new Thread(a);
		t.start();
		
	}
}

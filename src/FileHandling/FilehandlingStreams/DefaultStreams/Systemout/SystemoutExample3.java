package FileHandling.FilehandlingStreams.DefaultStreams.Systemout;
import java.io.*;
public class SystemoutExample3 
{
	public static void main(String[] args) throws IOException
	{
		int a=5;
		System.out.printf("The Number is %d%n",a);
		System.out.printf("The Number is %.2f%n",Math.PI);
		float b=3.3f;
		System.out.printf("The Number is %.4f%n",b);
		float c=2.7f;
		System.out.printf("The Number is %10.5f%n",c);
	}
}

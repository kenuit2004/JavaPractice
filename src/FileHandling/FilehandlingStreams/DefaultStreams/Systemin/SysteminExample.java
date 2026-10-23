package FileHandling.FilehandlingStreams.DefaultStreams.Systemin;
import java.io.*;
public class SysteminExample 
{
	public static void main(String[] args) throws IOException
	{
		System.out.println("Enter the Input:");
		int a=System.in.read();
		System.out.println("Our Value:"+(char)a);
		System.out.println("ASCII Value:"+a);
	}
}

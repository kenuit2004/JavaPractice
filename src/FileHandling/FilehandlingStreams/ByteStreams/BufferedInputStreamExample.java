package FileHandling.FilehandlingStreams.ByteStreams;
import java.io.*;
public class BufferedInputStreamExample 
{
	public static void main(String[] args) throws IOException
	{
		FileInputStream a=new FileInputStream("file.txt");
		BufferedInputStream b=new BufferedInputStream(a);
		System.out.println("Number of Bytes Remaining:"+b.available());
		if(b.markSupported())
		{
			b.mark(b.available());
		}
		b.skip(5);
		int ch;
		while((ch=b.read())!=-1)
		{
			System.out.print((char)ch);
		}
		System.out.println();
		b.reset();
		int ch1;
		while((ch1=b.read())!=-1)
		{
			System.out.print((char)ch1);
		}
		a.close();
	}
}

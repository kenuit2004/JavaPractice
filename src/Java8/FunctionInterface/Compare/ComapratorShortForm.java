package Java8.FunctionInterface.Compare;
import java.util.*;
public class ComapratorShortForm 
{
	public static void main(String[] args) 
	{
		Comparator<Integer> a=(x,y)->Integer.compare(x,y);
		System.out.println(a.compare(30,10));
	}
}
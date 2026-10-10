package Java8.FunctionInterface;
import java.util.*;
import java.util.function.BiConsumer;
public class BiConsumerNullPointer 
{
	public static void main(String[] args)
	{
		ArrayList<Integer> a=new ArrayList<>();
		a.add(100);
		a.add(200);
		a.add(300);
		a.add(300);
		a.add(400);
		a.add(500);
		ArrayList<Integer> b=new ArrayList<>();
		b.add(100);
		b.add(200);
		b.add(300);
		b.add(400);
		b.add(600);
		BiConsumer<List<Integer>,List<Integer>> list=(list1,list2)->{
			if(list1.size()!=list2.size())
			{
				System.out.println("False");
			}
			else
			{
				for(int i=0;i<list1.size();i++)
				{
					if(!list1.get(i).equals(list2.get(i)))
					{
						System.out.println("False");
						return;
					}
				}
				System.out.println("True");
			}
		};
		try
		{
			list.andThen(null).accept(a,b);
		}
		catch(Exception e)
		{
			System.out.println("Error:"+e);
		}
	}
}

package Java8.FunctionInterface;
import java.util.*;
import java.util.function.BiConsumer;
public class BiConsumerArrayIndexOutOfBounds 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> a=new ArrayList<>();
		a.add(100);
		a.add(200);
		a.add(300);
		a.add(400);
		ArrayList<Integer> b=new ArrayList<>();
		b.add(100);
		b.add(200);
		b.add(300);
		BiConsumer<List<Integer>,List<Integer>> list=(list1,list2)->{
			for(int i=0;i<list1.size();i++)
			{
				if(!list1.get(i).equals(list2.get(i)))
				{
					System.out.println("False");
					return;
				}
			}
			System.out.println("True");
		};
		BiConsumer<List<Integer>,List<Integer>> out=(list1,list2)->{
			list1.stream().forEach(System.out::println);
			list2.stream().forEach(num->System.out.print(num+" "));
		};
		try
		{
			out.andThen(list).accept(a,b);
		}
		catch(Exception e)
		{
			System.out.println("Error:"+e);
		}
	}

}

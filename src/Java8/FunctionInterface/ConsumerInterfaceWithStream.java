package Java8.FunctionInterface;
import java.util.List;
import java.util.function.Consumer;
import java.util.*;
public class ConsumerInterfaceWithStream 
{
	public static void main(String[] args) 
	{
		Consumer<Integer> a=num->System.out.println(num);
	    a.accept(10);
	    Consumer<List<Integer>> modify=list->{
	    	for(int i=0;i<list.size();i++)
	    	{
	    		list.set(i,2*list.get(i));
	    	}
	    };
	    Consumer<List<Integer>> out=list->list.stream().forEach(System.out::println);
	    List<Integer> list=new ArrayList<>();
	    list.add(10);
	    list.add(20);
	    list.add(30);
	    list.add(40);
	    list.add(50);
	    modify.accept(list);
	    out.accept(list);
	}
}
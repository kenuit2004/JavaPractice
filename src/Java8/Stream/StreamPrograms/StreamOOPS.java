package Java8.Stream.StreamPrograms;
import java.util.*;
import java.util.stream.*;
class Kenui
{
	int id,value;
	String type;
	Kenui(int id,int value,String type)
	{
		this.id=id;
		this.value=value;
		this.type=type;
	}
	public int getId()
	{
		return id;
	}
	public int getValue()
	{
		return value;
	}
	public String getType()
	{
		return type;
	}
}
public class StreamOOPS 
{
	public static void main(String[] args) 
	{
		List<Kenui> a=new ArrayList<>();
		a.add(new Kenui(1, 100, "GROCERY"));
        a.add(new Kenui(3, 80, "GROCERY"));
        a.add(new Kenui(6, 120, "GROCERY"));
        a.add(new Kenui(7, 40, "ELECTRONICS"));
        a.add(new Kenui(10, 50, "GROCERY"));
        List<Integer> b=a.stream()
                  .filter(n->n.type.equals("GROCERY"))
                  .sorted(Comparator.comparing(Kenui::getValue).reversed())
                  .map(Kenui::getId)
                  .collect(Collectors.toList());
        System.out.println(b);
	}
}

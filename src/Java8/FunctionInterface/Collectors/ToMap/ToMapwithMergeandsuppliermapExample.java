package Java8.FunctionInterface.Collectors.ToMap;
import java.util.*;
import java.util.stream.*;
public class ToMapwithMergeandsuppliermapExample 
{
	public static void main(String[] args) 
	{
		Stream<String[]> a=Stream.of(new String[][]
		{
			{"L","Lion"},
			{"T","Tiger"},
			{"L","Lash"}
		});
		LinkedHashMap<String,String> b=a
		 .collect(Collectors.toMap(p->p[0],p->p[1],(v1,v2)->v1+","+v2,LinkedHashMap::new));
		System.out.println(b);
	}

}

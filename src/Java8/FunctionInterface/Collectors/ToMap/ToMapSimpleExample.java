package Java8.FunctionInterface.Collectors.ToMap;
import java.util.stream.*;
import java.util.*;
public class ToMapSimpleExample 
{
	public static void main(String[] args)
	{
		Stream<String[]> a=Stream.of(new String[][]{
			{"Lion","Tiger"},
			{"Dog","Cat"}
		});
		Map<String,String> b=a
				               .collect(Collectors.toMap(p->p[0],p->p[1]));
		System.out.println(b);
	}
}

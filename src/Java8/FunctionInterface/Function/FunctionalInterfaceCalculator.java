package Java8.FunctionInterface.Function;
interface Calculate
{
	int value(int a,int b);
}
public class FunctionalInterfaceCalculator 
{
	public static void main(String[] args) 
	{
		Calculate add=(a,b)->a+b;
		Calculate sub=(a,b)->a-b;
		Calculate mul=(a,b)->a*b;
		Calculate div=(a,b)->a/b;
		System.out.println(add.value(30,10));
		System.out.println(sub.value(30,10));
		System.out.println(mul.value(30,10));
		System.out.println(div.value(30,10));
	}
}

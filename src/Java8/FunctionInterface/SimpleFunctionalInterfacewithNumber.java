package Java8.FunctionInterface;
@FunctionalInterface
interface Kenuitt
{
	int disp(int num);
}
class SimpleFunctionalInterfacewithNumber
{
	public static void main(String[] args)
	{
		Kenuitt a=(int num)->num*num;
		System.out.println(a.disp(10));
	}
}
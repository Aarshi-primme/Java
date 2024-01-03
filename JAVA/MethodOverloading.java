class Method
	{
	public int add(int a,int  b)
		{return a+b;}
	public int add(int a,int b,int c)
	 	{return a+b+c;}
	public double add(double a,double b,double c)
	 	{return a+b+c;}
	}
class MethodOverloading
{
	public static void main(String[] args)
	{
		Method m = new Method();
		System.out.println("add  int num1+num2 : "+m.add(1,2));	
		System.out.println("add  int num1+num2+num3 : "+m.add(2,4,7));	
		System.out.println("add  double num1+num2+num3 : "+m.add(67,98,43));	
	}
}
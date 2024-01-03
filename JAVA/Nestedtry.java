//throw and throws exception in Method
class Nestedtry
{
	static void demo()throws ArithmeticException
        {
	throw new ArithmeticException("demo of throws");
	}
    public static void main(String args[])
  {
	try
	{
	demo();
	}
	catch (ArithmeticException E)
	{
	System.out.println("Exception Caught");
	System.out.println(E.getMessage());
	}
   }
}


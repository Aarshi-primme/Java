
public class ArithmaticEXception{
                  public static void main(String a[])
{
	try 
		{ 
  	        a = null;
		 System.out.println("len :"+a.length);
		}
	catch(NullPointerException e)
	{
  	   System.out.println(e);
	}
    }
}
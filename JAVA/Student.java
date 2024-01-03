

//   1. stack me base data-segment hoga 
//.  vo uper se niche groow karega like jo data kast me hoga vhi pehle delete hoga and then line-by--line   process 
//.  uska memmory allocation manage he


//  2. heap me memory allocate hogi but not arrangement
//.  vo niche se uper like jo pehle enter kiya vo pehle delete ho sakata he
//.  uska memory allocation manage nhi he


class Personal{
 	String name;
	int age;
	
	public void write( )
	{
		System.out.println("writing something");
	}	

}

public class  OOP{
	public static void main(String a[])
	{
		Personal.name = "dimpal";
		Personal.age = 23;
		
		Perosnal.write();

	}

}
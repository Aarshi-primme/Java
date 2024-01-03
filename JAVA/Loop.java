class obj
{
String name;
int age;
  	
	public void volume()
	{
			System.out.println("my obj volume is : ");
	}
	public void Printcolor(){
			System.out.println(this.name );
			System.out.println(this.age );
	}
	obj(String name,int age)
	{
		this.name = name;
		this.age = age;
	}
}


public class Loop {
	public static void main(String a[])
	{
		obj obj1 = new obj("dimpal",23);   //obj() : that is a default constructor
							//when we make obj() ocnstructr then they will display with our customisation and also we can declare name and age into this paranthesis
		// obj1.name = "dimpal";
		// obj1.age = 23;
		obj1.Printcolor();
		
		obj1.volume();

	}

}
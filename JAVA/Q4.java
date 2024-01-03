class Bank
{
	public int GetintrestRate()
	{
		return  0;
	}
class Bob
{
	public int GetintrestRate()
	{
		return  5;
	}
}
class Sbi
{
	public int GetintrestRate()
	{
		return 4;
	}
}
}
class Q4
{
	public static void main(String args[])
	{
		Bob b = new Bob();
		Bank B = new Bank();
		Sbi s = new Sbi();
	
		s.GetintrestRate();
		b.GetintrestRate();
		B.GetintrestRate();

		
		System.out.println("Bob GetintrestRate : "+ b.GetintrestRate());
		System.out.println("Sbi GetintrestRate : "+ s.GetintrestRate());
		System.out.println("Bank GetintrestRate : "+ B.GetintrestRate());
	}
}
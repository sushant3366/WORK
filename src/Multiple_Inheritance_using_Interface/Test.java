package Multiple_Inheritance_using_Interface;

public class Test implements Interface1,Interface2
{
	public void m1()
	{
		System.out.println("method m1: from interface1 completed in IC");
	}
	public void m2()
	{
		System.out.println("method m2: from interface1 completed in IC");
	}
	public void m3()
	{
		System.out.println("method m3: from interface2 completed in IC");
	}
	public void m4()
	{
		System.out.println("method m3: from interface2 completed in IC");
	}
}

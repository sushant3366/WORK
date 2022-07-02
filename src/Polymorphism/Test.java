package Polymorphism;

public class Test 
{
	public static void main(String[] args) 
	{
		father f1=new father();
		f1.car();
		f1.money();
		f1.home();
		
		son s1=new son();
		s1.bike();
		s1.car();
		s1.money();
		s1.home();
	}
	
}

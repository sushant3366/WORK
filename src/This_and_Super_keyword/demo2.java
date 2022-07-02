package This_and_Super_keyword;

public class demo2 extends demo1
{
	int a=20;
	
	public void m1()
	{
		int a=30;              //local variable
		System.out.println(a);  
		System.out.println(this.a);  //-->global variable call from same class
		System.out.println(super.a);  // -->global variable call from super class
	}
	
	
	public static void main(String[] args) 
	{
		demo2 d=new demo2();
		d.m1();
	}
}

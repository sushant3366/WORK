package constructor;

public class class1 
{
	int num1;int num2;
	
	class1 (int a,int b)
	{
		num1=a;num2=b;
	}
	public void m1()
	{
		System.out.println(num1+num2);
	}
	
	public static void main(String[] args) 
	{
		class1 s1=new class1(10,20);
		s1.m1();
		class2 s2=new class2(20,30);
		s2.m2();
		
	}
}

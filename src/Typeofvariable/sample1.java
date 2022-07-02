package Typeofvariable;

public class sample1 
{
	//example of static global variable
	
		static int a=10;      //static ->global variable
		
		
		public static void main(String[] args) 
		{		
			//static global variable call from same class
			System.out.println(a);          //variablename
			
			
			//static global variable call from diff class
			System.out.println(sample2.b);      //classname.variablename
			m1();
			sample1 s1=new sample1();
			s1.m2();
		}
		
		
		public static void m1()
		{
			System.out.println(a);
		}
		
		public void m2()
		{
			System.out.println(a);
		}
		

}

//Note: we can access static global variable in both static & non-static method
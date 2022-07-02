package Typeofvariable;

public class sample3 
{
	//example non-static global variable
	
		int c=30;  //non-static ->global variable
		
		public static void main(String[] args) {
			//non-static global variable call from same class
			sample3 s3=new sample3();      //1. create object of same class    
			System.out.println(s3.c);      //2. objectName.variable
			
			//non-static global variable call from diff class
			sample2 s2=new sample2();   //1. create object of diff class
			System.out.println(s2.d);   //2. objectName.variable
			m3();                       //calling m3 method
		}
		
		public static void m3()
		{
			sample3 s3=new sample3();  // non static global variable can't be accessed by static method
			System.out.println(s3.c);  //so we need to creat object
		}
		
		public void m4()         
		{
			System.out.println(c);  //can access non-static method as variable is non-static global
		}
		
}


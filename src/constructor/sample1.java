package constructor;

public class sample1 
{
	//example of default constructor
	
		//default constructor  --> provided by compiler
		//use: to copy all the members of class into object
//		sample1()
//		{
//			
//		}
		

		public void m1() 
		{
			System.out.println("running method m1");		
		}
		

		
		public static void main(String[] args) {
			
			sample1 s1=new sample1();
			s1.m1();
			
			//1. sample1  --> classname  --> datatype
			//2. s1  --> objectname  --> to identify Object
			//3. new  --> keyword   --> to create blank/empty object
			//4. sample1()  --> classname()  -->constructor  -->use to copy all the 
//			                                       members of class into object
				
			
			sample2 s2=new sample2();
			s2.m2();
		}

}

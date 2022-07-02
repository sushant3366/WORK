package constructor;

public class sample5 
{
	//example of user defined -->without parameter constructor
	
		//step1: declaration
		int a;       //10
		int b;	     //20
		
		//step2: initialization
		//user defined constructor --> provided by user
		//use1:  to initialize global variable
		//use2: to copy all the members of class into object
		sample5()        //without parameter constructor
		{
			a=10;
			b=20;
		}
		
		//step3: usage
		
		public void addition() 
		{
			System.out.println(a+b);   //10+20 =30
		}
		
		
		public static void main(String[] args) {
				
			sample3 s3=new sample3();   //without parameter constructor
			s3.addition();     //30
			
			
			sample4 s4=new sample4();   //without parameter constructor
			s4.sub();    //20
			
		}
}

package constructor;

public class sample6
{
	//example user defined -->with parameter constructor  --> single constructor

		int num1;   //10   5  //global variable
		int num2;  //40   6
		
		//int,int(2 int) parameter constructor
		//use1: to initialize global variable
		//use2: to load/copy all members of class into object
		sample6(int a, int b)           //a=10 ,5    b=40  ,6  
		{
			num1 = a;      //10  5 //assign local variable info into global variable
			num2 = b;     //40	 6	
		}
		
		public void addition() 
		{
			System.out.println(num1 + num2);
		}
		
		public void mul()
		{
			System.out.println(num1*num2);
		}
		
		
		public static void main(String[] args) {
			
			sample6 s6=new sample6(10,40);       //constructor with parameter
			s6.addition();
			s6.mul();
			
			System.out.println("--------------");
			
			sample6 s7=new sample6(5, 6);
			s7.addition();      //11
			s7.mul();          //30
			
			System.out.println("------------");
			
			sample6 s8=new sample6(100, 200);
			s8.addition();    // 300
			s8.mul();        //
			
			System.out.println("------------------------------");
			
			sample7 s9=new sample7(70, 15);
			s9.sub();
			
			System.out.println("-----");
			
			sample7 s10=new sample7(150, 40);
			s10.sub();     //110
}}

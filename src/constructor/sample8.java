package constructor;

public class sample8 
{
	//user defined -->with parameter -->multiple constructor   --> Constructor overloading
	
		int num1;   //30
		int num2;    //35
		String studentName;   //ashok
		
		//String parameter constructor
		sample8(String name)   //ashok
		{
			studentName = name;   //ashok
		}
		 
		//int , int parameter constructor
		sample8(int a, int b)
		{
			num1=a;   //30
			num2=b;    //35
		}
		
		public void studentInfo()
		{
			System.out.println(studentName);
		}
			
		public void addition()
		{
			System.out.println(num1+num2);
		}
		
		
		
		public static void main(String[] args) {
			
			sample8 s8=new sample8(30, 35);
			s8.addition();     //65
			
			sample8 s9=new sample8("Ashok");
			s9.studentInfo();
		}
}

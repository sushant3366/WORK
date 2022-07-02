package Methods;

public class sample 
{

	 
		int b=20;            //global variable
		
		public void m1()
		{
			int a=10;         //local variable
			System.out.println(a);	
			System.out.println(b);
		}
		
		public void m2()
		{
			//System.out.println(a);
			System.out.println(b);
		}
		
		
		public static void main(String[] args) {
			
			sample s=new sample();
			s.m1();
			s.m2();
			

}}
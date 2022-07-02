package Methods;

public class Class1
{
	public static void main(String[] args) 
	{
		
			System.out.println("hii");  
			m1();                        //static method call from same calss
			Class1 t=new Class1();
			t.m2();                      //non-static method call from same calss
			Class2.m3();                 //static method call from different calss
		
			Class2 t2=new Class2();
					t2.m4();             //non-static method call from different calss
		}
		
	public static void m1()   //----------------1
	{
		System.out.println("hello");
	}
	void m2() {
		System.out.println("m2");
	}
	


}
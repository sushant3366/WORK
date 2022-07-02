package returntype;

public class sample1 
{
         //addition method with int return type
	public static int addition(int a,int b)
	{
		int sum=a+b;
		return sum;
		
	}
	     // method with string return type
	public static String ConvertToCap(String name) 
	{
	    String s1=name.toUpperCase();
	    return s1;
	}
	
	
	public static void main(String[] args) 
	{
		int num1 = addition(10, 20);
		System.out.println(num1);
		System.out.println(addition(100, 500));
		
		System.out.println(ConvertToCap("abc"));
	}
}


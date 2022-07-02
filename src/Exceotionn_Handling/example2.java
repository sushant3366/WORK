package Exceotionn_Handling;

public class example2 
{
	public static void main(String[] args)
	{
		
		int a=10; int b=0;
		int c=0;
		
		try
		{
			c=a/b;                     //risky code
		}
		catch(ArithmeticException e)
		{
			System.out.println();
			System.out.println("Arithmetic exception handeled");
		}
		System.out.println(c);
		System.out.println("hii");
	}
	
}

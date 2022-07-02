package Exceotionn_Handling;

public class example1 
{
public static void main(String[] args) {
		
		
		int ar[]= new int[5];
				
		try 
		{
			ar[7]=10;      //risky code
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBounds Exception handled");
			ar[0]=10;     //alternate solution
		}
				
		
		System.out.println("Hi");
		System.out.println("Hello");		
}
}
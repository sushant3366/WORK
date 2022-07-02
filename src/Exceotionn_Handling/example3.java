package Exceotionn_Handling;

public class example3
{
public static void main(String[] args) 
{
	int a;
	int arr[]=new int[5];
	try
	{
		arr[7]=10;
	}
	catch(ArithmeticException e)
	{
		System.out.println("ArithmeticException handeled");
	}
	catch(StringIndexOutOfBoundsException e) 
	{
		System.out.println("StringIndexOutOfBoundsException handled");
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println("ArrayIndexOutOfBoundsException handled");
	}
	System.out.println("hii");
	System.out.println("hello");
}
}

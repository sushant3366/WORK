package Exceotionn_Handling;

public class example5 {

	public static void main(String[] args) 
	{
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
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("genericException handeled");
		}
		System.out.println("hii");
		System.out.println("hello");

	}

}

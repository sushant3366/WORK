package Exceotionn_Handling;

public class example4 
{
	public static void main(String[] args) 
	{
		int arr[] =new int[5];
		
		try
		{
			arr[7]=10;
		}
		catch(Exception e)          //generic exception
		{
			e.printStackTrace();
			
			System.out.println("generic exception handled");
		}
		System.out.println("hii");
	}
}

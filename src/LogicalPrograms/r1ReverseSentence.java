package LogicalPrograms;

public class r1ReverseSentence 
{
	public static void main(String[] args) 
	{
//		String str="My name is abc";
//		String arr[]=str.split(" ");
//		
//		for(int i=arr.length-1;i>=0;i--)
//		{
//			System.out.print(arr[i]+" ");
//		}
		String str="my name is abc";
		String[] arr = str.split(" ");
		
		for(int i=arr.length-1; i>=0;i--)
		{
			System.out.println(arr[i]);
		}
	}
}

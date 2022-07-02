package LogicalPrograms;

public class r2ReverseEachWordInSentence
{
	public static void main(String[] args) 
	{
		String str="my name is abc";
		String arr[]=str.split(" ");
		
		for(int i=0;i<arr.length;i++)
		{
			String s1 = arr[i];
			
			arr[i]=ReverseString(s1);
			System.out.print(arr[i]+" ");
		}
		
	}	
				
		public static String ReverseString(String inp)
		{
			String rev="";
			for(int i=inp.length()-1;i>=0;i--)
			{
				rev=rev+inp.charAt(i);
				
			}
			return rev;
	}
}




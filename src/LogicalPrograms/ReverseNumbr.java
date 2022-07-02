package LogicalPrograms;

public class ReverseNumbr 
{
	public static void main(String[] args)
	{
		int num=12345;
		String str=Integer.toString(num);
		String rev="";
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		
		int revnum=Integer.parseInt(rev);
		System.out.println(revnum);
	}
}

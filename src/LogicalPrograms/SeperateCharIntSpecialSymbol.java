package LogicalPrograms;

public class SeperateCharIntSpecialSymbol 
{
	public static void main(String[] args) 
	{
		StringBuffer alpha=new StringBuffer();
		StringBuffer num = new StringBuffer();
		StringBuffer special = new StringBuffer();

		String str="hello123@#";
		
		for(int i=0;i<str.length();i++)
		{
			if(Character.isDigit(str.charAt(i)))
			{
				num.append(str.charAt(i));
			}
			else if(Character.isAlphabetic(str.charAt(i)))
			{
				alpha.append(str.charAt(i));
			}
			else
				special.append(str.charAt(i));
		}
		System.out.println(alpha+"\n"+num+"\n"+special);
	}
	      
	      
	   
}

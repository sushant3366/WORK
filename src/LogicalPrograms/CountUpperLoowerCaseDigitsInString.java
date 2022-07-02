package LogicalPrograms;

public class CountUpperLoowerCaseDigitsInString 
{
	public static void main(String[] args) 
	{
		String str="Selenium21";
		int upperCase=0;
		int lowerCase=0;
		int digits=0;
		int other=0;
		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			if(Character.isUpperCase(ch))
			{
				upperCase++;
			}
			else if (Character.isLowerCase(ch))
			{
				lowerCase++;
			}
			else if(Character.isDigit(ch))
			{
				digits++;
			}
			else
			{
				other++;
			}	
		}
		System.out.println("Upper case : "+upperCase +"\nLower case : "+lowerCase +"\ndigits : "+digits);
	}
}

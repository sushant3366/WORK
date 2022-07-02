package LogicalPrograms;

public class VowelsInString {

	public static void main(String[] args)
	{
		String str="welcome";
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
					count++;
//						System.out.println("vowels are "+str.charAt(i));
				
					
		}

	System.out.println("Total Vowels are :"+ count);

}}

	
	
package LogicalPrograms;

public class find_total_no_of_white_spaces_in_String
{
	public static void main(String[] args) 
	{
		String str=" aa b cd efgh ijk";
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==' ')
				count++;
		}
		System.out.println("Total white spaces are "+count);
	}
}

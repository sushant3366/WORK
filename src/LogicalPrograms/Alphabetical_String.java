package LogicalPrograms;

import java.util.Arrays;

public class Alphabetical_String 
{
	public static void main(String[] args) 
	{
		   String str="selenium";
		      
		      char[] ch1 = str.toCharArray();	
		      Arrays.sort(ch1);
		      System.out.println(ch1);
		      for(char s1:ch1)
		      {
		    	  System.out.print(s1);
		      }
		      
	}
}

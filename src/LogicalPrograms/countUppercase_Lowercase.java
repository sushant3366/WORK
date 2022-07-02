package LogicalPrograms;

import java.util.Arrays;

public class countUppercase_Lowercase 
{
	public static void main(String[] args) 
	{
		String str1 = "AbRtt p";
	      int upperCase = 0;
	      int lowerCase = 0;
	      char[] ch = str1.toCharArray();
	      for(char chh : ch) 
	      {
	         if(chh >='A' && chh <='Z') 
	         {
	            upperCase++;
	         } else if (chh >= 'a' && chh <= 'z') {
	            lowerCase++;
	         } else {
	            continue;
	         }
	      }
	      System.out.println("Count of Uppercase " + upperCase + " and of Lowercase: " + lowerCase);
	   
	   
	      
	}
}
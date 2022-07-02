package LogicalPrograms;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class r4Count_Reapeating_Char_In_String_Using_Hashmap
{
	public static void main(String[] args) 
	{
		String str = "abcaba";

		HashMap<Character, Integer> mp = new HashMap<Character, Integer>();
						
						// 5<=5
		for (int i = 0; i <str.length(); i++) 
		{					  // 5
			char s1 = str.charAt(i);     //a 
			
			if (mp.containsKey(s1))   //a
			{
				mp.put(s1, mp.get(s1) + 1);    //a, 2+1 
			} 
			else
			{
				mp.put(s1, 1);   //c,1  
			}

		}
		
		
		Set<Character> keys = mp.keySet(); //[a, b, c]
		
		//print occurence of each char
		for (Character key : keys) 
		{	
			System.out.println(key +": "+ mp.get(key));
		}
		
		
		
//		print only duplicate element
//		for (Character key : keys) 
//		{
//			if(mp.get(key)>1)
//			{
//				System.out.println(key +": "+ mp.get(key));
//			}
//		}
		
		//System.out.println("a: "+ mp.get('a'));
	}
}

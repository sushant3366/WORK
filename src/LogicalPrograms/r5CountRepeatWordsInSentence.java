package LogicalPrograms;

import java.util.HashMap;
import java.util.Set;

public class r5CountRepeatWordsInSentence 
{
	public static void main(String[] args) 
	{
		

			String str = "Sachin Tendulkar as God of Cricket after he started to break all the Cricket records and brought waves in Cricket books";

			String ar[] = str.split(" "); // [Sachin Tendulkar as “God of Cricket” after he started to break all the Cricket records and brought waves in Cricket books]

			HashMap<String, Integer> mp = new HashMap<String, Integer>();

			
			for (int i = 0; i < ar.length ; i++)
			{
								//2
				String s1 = ar[i];  //sachin
				
				if (mp.containsKey(s1)) 
				{
					mp.put(s1, mp.get(s1) + 1);
				} 
				else 
				{
					mp.put(s1, 1);
				}

			}

			Set<String> keys = mp.keySet(); // [abc abcd xyz]
			
			for (String key : keys) 
			{		
				System.out.println(key + ": " + mp.get(key));
			}	
			
			//Collection<Integer> allValues = mp.values(); //[1 2 3 4]
			
//			for (String key : keys) 
//			{		
//				if(key.equals("Cricket"))
//				{
//				System.out.println(key + ": " + mp.get(key));
//				}
//			}
	}
}

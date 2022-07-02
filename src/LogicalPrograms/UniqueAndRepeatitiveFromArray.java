package LogicalPrograms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class UniqueAndRepeatitiveFromArray 
{

	public static void main(String[] args) 
	{
		int ar[]= {1,1,2,3,3,3,4};
//		HashMap<Integer,Integer> mp=new HashMap<Integer,Integer>();
//		
//		for(int i=0;i<ar.length;i++)
//		{
//			int s1 = ar[i];
//			if(mp.containsKey(s1))
//			{
//				mp.put(s1, mp.get(s1)+1);
//			}
//			else
//			{
//				mp.put(s1, 1);
//			}			
//		}
//		
//		Set<Integer> keys = mp.keySet();
//		for(Integer key:keys)
//		{
//		
//			{
//				System.out.println(key+" : "+mp.get(key));
//			}
//		}
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		for(int i=0;i<ar.length;i++)
		{
			int count=0;
			if(!al.contains(ar[i]))
				{
					al.add(ar[i]);
					count++;
				
			for(int j=i+1;j<ar.length;j++)
			{
				if(ar[i]==ar[j])
				{
					count++;
				}
			}

			System.out.println(ar[i]+" : "+count);
			
		}
		}
		
	}
}

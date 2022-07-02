package collection;

import java.util.HashSet;
import java.util.Iterator;

public class example4_Hashset 
{
	public static void main(String[] args)
	{
		HashSet hs=new HashSet();
		hs.add("abc");
		hs.add(100);
		hs.add("A");
		hs.add(200);
		hs.add(100);
		hs.add(null);
		hs.add(null);
 
		System.out.println(hs);
		System.out.println(hs.size());
		System.out.println(hs.isEmpty());
		hs.contains(200);
		
		hs.remove(200);
		System.out.println(hs);
		
		System.out.println("-----print data using Iterator cursor-----");
		Iterator itr=hs.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("-----print data using for each loop-----");
		for(Object s1:hs)
		{
			System.out.println(s1);
		}
	}
}

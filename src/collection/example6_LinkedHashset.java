package collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class example6_LinkedHashset 
{
	public static void main(String[] args) 
	{
		LinkedHashSet lhs=new LinkedHashSet();
		lhs.add("abc");
		lhs.add(50);
		lhs.add('A');
		lhs.add(65.5f);
		lhs.add(50);
		lhs.add(null);
		lhs.add(null);
		
		System.out.println(lhs);
		System.out.println(lhs.size());
		System.out.println(lhs.isEmpty());
		System.out.println(lhs.contains(50));
		
		lhs.remove('A');
		System.out.println(lhs);
		
		System.out.println("--print data using iterator cursor--");
		Iterator itr = lhs.iterator();
		while(itr.hasNext()) 
		{
			System.out.println(itr.next());
		}
		
		System.out.println("--print data using for each loop--");
		for( Object s1: lhs)
		{
			System.out.println(s1);
		}

		
	}
}

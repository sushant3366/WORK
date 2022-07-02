package collection;

import java.util.ArrayList;
import java.util.HashSet;

public class example5_Hashset1 
{
	public static void main(String[] args)
	{
		ArrayList al=new ArrayList();
		al.add("abc");
		al.add(100);
		al.add('A');
		al.add(75.5f);
		al.add(100);
		al.add(null);
		al.add(null);
		
		System.out.println(al);
		HashSet hs=new HashSet(al);
		System.out.println(hs);
		
	}
}

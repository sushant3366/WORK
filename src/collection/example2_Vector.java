package collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class example2_Vector 
{
	public static void main(String[] args) 
	{
		Vector v=new Vector();
		v.add("abc");
		v.add("A");
		v.add(100);
		v.add(23.5f);
		v.add(null);
		v.add(null);
		v.add(200);
		
		System.out.println(v);
		System.out.println(v.size());
		System.out.println(v.isEmpty());
		System.out.println(v.contains(100));
		System.out.println(v.get(3));
		
		// add/insert info in between Vector--> right shift operation
		System.out.println(v);
		v.add(2, 500);
		System.out.println(v);
	
		// remove/delete info in between Vector--> left shift operation
		v.remove(1);
		System.out.println(v);
		
		//update or modify info in between vector
		v.set(4, "hii");   //update null to hii
		System.out.println(v);
		
		System.out.println("---print Vector using iterator cursor----");
		Iterator itr=v.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("---print Vector using Listiterator cursor----");
		ListIterator litr=v.listIterator();
		while(litr.hasNext())
		{
			System.out.println(litr.next());
		}
		
		System.out.println("---print Vector using for loop----");
		for(int i=0;i<v.size();i++)
		{
			System.out.println(v.get(i));
		}
		
		System.out.println("---print Vector using for each loop----");
		for(Object s1:v)
		{
			System.out.println(s1);
		}
		
		System.out.println("---print Vector using enumeration cursor----");
		Enumeration enu=v.elements();
		while(enu.hasMoreElements())
		{
			System.out.println(enu.nextElement());
		}
	
	}
}

package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class example1_ArrayList 
{
	public static void main(String[] args) 
	{
		ArrayList al=new ArrayList();     //default capacity 10
//		ArrayList al=new ArrayList(8);    //capacity 8
		
		al.add("abc");
		al.add(100);
		al.add('A');
		al.add(21.3f);
		al.add(200);
		al.add(null);
		al.add(null);
	
		System.out.println(al);
		System.out.println(al.size());
		System.out.println(al.isEmpty());
		System.out.println(al.contains(100));
		System.out.println(al.get(2));
		
		// add/insert info in between arraylist--> right shift operation
		System.out.println(al);
		al.add(4, 300);
		System.out.println(al);
		
		// remove/delete info in between arraylist--> left shift operation
		al.remove(4);
		System.out.println(al);
		
		System.out.println("---print arraylist using iterator cursor----");
		Iterator itr=al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("---print arraylist using Listiterator cursor----");
		ListIterator litr=al.listIterator();
		while(litr.hasNext())
		{
			System.out.println(litr.next());
		}
		
		System.out.println("---print arraylist using for loop----");
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
			
		}
		
		System.out.println("---print arraylist using for each loop----");
		for(Object s1:al)      //here we dont know data type in arraylist henc we are using Object
		{
			System.out.println(s1);
		}
		
		System.out.println("----------------------------------------");
		ArrayList<Integer> all=new ArrayList<Integer>();
		all.add(1);
		all.add(2);
		all.add(3);
		
		System.out.println(Collections.max(all));
		System.out.println(Collections.min(all));
		
		
		
		
		
		
		
		
		
		
	}
}

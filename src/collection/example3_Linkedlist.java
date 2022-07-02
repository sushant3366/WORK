package collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class example3_Linkedlist 
{
	public static void main(String[] args) 
	{
		LinkedList ll=new LinkedList();
		
		ll.add("abc");
		ll.add(100);
		ll.add('A');
		ll.add(65.5f);
		ll.add(100);
		ll.add(null);
		ll.add(null);
		
		System.out.println(ll);
		System.out.println(ll.size());       //7
		System.out.println(ll.contains(100));     //true
		System.out.println(ll.isEmpty());    //false
		System.out.println(ll.get(2));   //A
		
		//add info in between linkedlist
		System.out.println(ll);
		ll.add(4,500);
		System.out.println(ll);
		
		
		//remove or delete info in between linkedlist
		ll.remove(4);
		System.out.println(ll);
		
		//update or modify info in between linkedlist
		ll.set(2, 'B');
		System.out.println(ll);
		
		
		System.out.println("----print linkedlist data using iterator cursor----");
		Iterator itr = ll.iterator();
		while(itr.hasNext()) 
		{
			System.out.println(itr.next());
		}
		
		System.out.println("----print linkedlist data using Listiterator cursor----");
		ListIterator litr = ll.listIterator();
		while(litr.hasNext()) 
		{
			System.out.println(litr.next());
		}
		
		
		System.out.println("----print linkedlist data using for loop----");
		for(int i=0; i<=ll.size()-1; i++)
		{
			System.out.println(ll.get(i));
		}
		
		System.out.println("----print linkedlist data using foreach loop----");
		
		for(Object s1:ll)
		{
			System.out.println(s1);
		}
		
		
	
	}
}

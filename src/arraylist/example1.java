package arraylist;

import java.util.ArrayList;

public class example1 
{
	public static void main(String[] args) 
	{
	   ArrayList<Integer> t1=new ArrayList<Integer>();
	   t1.add(1);    //index 0
	   t1.add(2);    //index 1
	   t1.add(3);    //index 2
	   t1.add(4);    //index 3
	   t1.add(5);    //index 4

	   System.out.println(t1);            //show all elements
	   System.out.println(t1.get(1));     //show element at index 1

	   t1.set(3, 12);                     //replace element of index 3 with 12
	   System.out.println(t1.get(3));
	   
	   t1.remove(4);                      //remove element of index 4
	   System.out.println(t1);
	   
	   System.out.println(t1.size());
	   
	   t1.clear();                        //clear all elements in array
	   System.out.println(t1);
			   System.out.println(t1.get(1));  //will throw exception
	}
}

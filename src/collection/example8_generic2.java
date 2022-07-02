package collection;

import java.util.TreeSet;

public class example8_generic2 
{
	public static void main(String[] args) 
	{
		TreeSet<String> tr=new TreeSet<String>();
		tr.add("abc");
		tr.add("xyz");
		tr.add("hello");
		
		System.out.println(tr);
		
		for(String s1:tr)
		{
			System.out.println(s1);
		}
	}
}

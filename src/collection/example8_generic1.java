package collection;

import java.util.TreeSet;

public class example8_generic1 
{
	public static void main(String[] args) 
	{
		TreeSet<Integer> tr=new TreeSet<Integer>();  //only integer allow
		tr.add(100);
		tr.add(300);
		tr.add(200);
		
		System.out.println(tr);

		for(Integer s1 : tr)
		{
			System.out.println(s1);
		}
	}
}

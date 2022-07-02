package LogicalPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDuplicatwElementInArrayList 
{
	public static void main(String[] args) 
	{
		ArrayList al=new ArrayList(Arrays.asList(1,1,2,3,4,4,5));
		System.out.println(al);
		
		LinkedHashSet lhs=new LinkedHashSet(al);
		System.out.println(lhs);
		
		ArrayList all=new ArrayList(lhs);
		System.out.println(all);
	}
}

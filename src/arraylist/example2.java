package arraylist;

import java.util.ArrayList;

public class example2 
{
   public static void main(String[] args) 
   {
	ArrayList<String> obj=new ArrayList<String>();
	
	obj.add("BMW");
	obj.add("Merseries");
	obj.add("Audi");
	obj.add("RollsRoys");
	obj.add("Tesla");
	
	
	for(int i=0;i<obj.size();i++)
	{
		System.out.println(obj.get(i));
	}
}
}

package LogicalPrograms;

import java.util.Arrays;

public class example2compare_2_Interger_Arrays
{
	public static void main(String[] args) 
	{
		int a[]= {10,20,30};
		int b[]= {50,60,70};
		int c[]= {50,60,70};
		
		System.out.println(Arrays.equals(a, b));
		System.out.println(Arrays.equals(a, c));
		System.out.println(Arrays.equals(b, c));
		
	}
}

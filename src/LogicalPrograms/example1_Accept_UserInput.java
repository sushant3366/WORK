package LogicalPrograms;

import java.util.Scanner;

public class example1_Accept_UserInput 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
	/*	System.out.println("Enter num1 ");
		
		int num1 = sc.nextInt();
		
		System.out.println("enter num2 ");
		
		int num2 = sc.nextInt();
		
		System.out.println(num1+num2);*/
	
	System.out.println("enter student name ");
	String s1 = sc.next();   //for string
	
	System.out.println(s1.toUpperCase());
	
	}
}

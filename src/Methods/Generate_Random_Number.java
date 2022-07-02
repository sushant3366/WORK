package Methods;

import java.util.Random;
public class Generate_Random_Number 
{
	public static void main(String[] args) 
	{
		Random rand=new Random();
		int a=rand.nextInt(10);  //0 to 9
		System.out.println(a);
		
		System.out.println(Math.random());
	}
}

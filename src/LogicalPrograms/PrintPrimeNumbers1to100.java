package LogicalPrograms;

public class PrintPrimeNumbers1to100 
{
	public static void main(String[] args) 
	{
//		int count=0;
		
		for(int i=2;i<=100;i++)
		{
			int count=0;
			for(int j=1;j<=i;j++) 
			{
				if(i%j==0)
				{
					count++;
				}
				
			}
			if(count==2)
			{
				System.out.print(i+" ");
			}
			
		}
		
		
//		int count=0;                odd numbers 1 to 100
//		for(int i=1;i<=100;i++)
//		{
//			if(i%2!=0)
//			{
//			
//			System.out.println(i);
//			}
			
	}
}

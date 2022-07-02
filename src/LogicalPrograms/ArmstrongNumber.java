package LogicalPrograms;

public class ArmstrongNumber 
{
	public static void main(String[] args) 
	{
		int num=153;          //Armstrong number: 153:(1*1*1)+(5*5*5)+(3*3*3)=153
		int temp=num;
		int sum=0;
		while(temp>0)
		{
			int rem=temp%10;
			sum=sum+(rem*rem*rem);  //27+125+
			temp=temp/10;
		}
		if(num==sum)
		{
			System.out.println("Its Armstrong number");
		}
		else
		{
			System.out.println("Not Armstrong number");
		}
		
	}
}

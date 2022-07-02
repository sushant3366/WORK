package array;

public class MultidimensionalArray
{
	public static void main(String[] args) 
	{
		
		int arr[][]=new int[2][3];
		arr[0][0]=10;
		arr[0][1]=20;
		arr[0][2]=30;
		arr[1][0]=40;
		arr[1][1]=50;
		arr[1][2]=60;
		
		System.out.println(arr[0][2]);
		System.out.println(arr.length);  //it will show only number of rows
		
		System.out.println("---------------------------");
		
		for(int i=0;i<=1;i++)
		{
			for(int j=0;j<=2;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("--------------------------");
		
		int ar[][]= {{10,20,30},{40,50,60}};
		
		for(int i=0;i<=1;i++)
		{
			for(int j=0;j<=2;j++)
			{
				System.out.print(ar[i][j]+" ");
			}
			System.out.println();
		}
	}
}

package array;

public class SortArrayWithoutSortMethod 
{
	public static void main(String[] args) 
	{
		int arr[]= {2,3,5,6,1,4,10};
		int temp=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			System.out.println(arr[i]);
			
			
		}
		System.out.println("second largest number in array : "+ (arr.length-1));  //second largest number in array
		
	}
}

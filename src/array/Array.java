package array;
import java.util.Arrays;

public class Array 
{
public static void main(String[] args) {
		
		//step1: array declaration
		String	ar [] = new String[5];
		
		//step2: array initialization
		ar[0]="rahul";
		ar[1]="ganesh";
		ar[2]="mahesh";
		ar[3]="suresh";
		ar[4]="ramesh";
		
		//step3: array usage
		System.out.println(ar[4]);    
		System.out.println(ar.length);   //5
		
		System.out.println("---------print all info in array------------");
		

		for(int i=0; i<=ar.length-1; i++)
		{                        //4
			System.out.println(ar[i]);   //rahul   ganesh mahesh suresh ramesh
		} 		
		
		System.out.println("----------------------------------------------------");
		
		int arr[]=new int[4];
		arr[0]=30;
		arr[1]=10;
		arr[2]=40;
		arr[3]=20;
		System.out.println("---------print original data----------");
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);
		
		Arrays.sort(arr);
		System.out.println("-----ascending order------");
		
		for(int i=0; i<=arr.length-1; i++)
		{
			System.out.println(arr[i]);
		}
		
		System.out.println("-----descending order------");

		for(int i=arr.length-1; i>=0; i--)
		{
			System.out.println(arr[i]);
		
		}
		
	
		
	
		
		
		
		
		
		
		


}
}

package in.ineuron.main;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int [] arr = new int[7];
		for(int i=0; i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++) 
		{
			for(int j=1;j<arr.length-i;j++) 
			{
				if(arr[j-1]>arr[j]) 
				{
					int temp = arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
				}
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
			}
	}

}

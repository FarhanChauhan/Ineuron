package in.ineuron.main;

import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array");
		int [] arr = new int[7];
		for(int i=0; i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		      int n = arr.length;
		      
		        // One by one move boundary of unsorted sub array
		        for (int i = 0; i < n-1; i++)
		        {
		            // Find the minimum element in unsorted array
		            int min_idx = i;
		            for (int j = i+1; j < n; j++){
		                if (arr[j] < arr[min_idx])
		                    min_idx = j;
		            }
		 
		            // Swap the found minimum element with the first
		            // element
		            int temp = arr[min_idx];
		            arr[min_idx] = arr[i];
		            arr[i] = temp;
		        }
			
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
			}
	}

}

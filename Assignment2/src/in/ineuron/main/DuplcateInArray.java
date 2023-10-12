package in.ineuron.main;

import java.util.Scanner;

public class DuplcateInArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int [] arr = new int [7];
		for (int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		int count =0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					count=1;
					System.out.println(arr[i]);
				}
			}
		}
		if(count==0) {
			System.out.println("No duplicates found");
		}

	}

}

package in.ineuron.main;

public class SubsetOfArray {

	public static void main(String[] args) {
		int[] arr1 = {1,2,3,4,5,6,7,8};
		int[] arr2 = {2};
		boolean present =false;
		for(int i=0;i<arr2.length;i++)
		{
			present = false;

			for(int j=0;j<arr1.length;j++)
			{
				if(arr2[i]==arr1[j])
				{
					present = true;
				}
			}
			if(present == false)
			{
				System.out.println("Array is not a subset of another array ");
				break;
			}
		}
	
	
		if(present == true)
		{
			System.out.println("Array is a subset of another array");
		}
		
	}
}

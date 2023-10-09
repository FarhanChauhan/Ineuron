public class Question1 {

	public static void main(String[] args)
	{
		String s = "ffarhhan chhauhann";
		char[]arr=s.toCharArray();
		
		int index1=1;
		int index2=1;
		
		while(index1 != arr.length)
		{
			if(arr[index1]!=arr[index1-1])
			{
				arr[index2]=arr[index1];
				index2++;
			}
			index1++;
		}
		s = new String(arr);
		System.out.println(s.substring(0,index2));
		
	}
	

}

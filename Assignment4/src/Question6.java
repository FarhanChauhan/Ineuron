
public class Question6 {

	public static void main(String[] args) {
		String s1 = " THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG";
		boolean flag = false;
		s1=s1.replace(" ","");
		char charArray [] = s1.toCharArray();
		int arr [] = new int[26];
		for(int i=0;i<charArray.length;i++)
		{
			int index = charArray[i]-65;
			arr[index]++;
		}
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==0)
			{
				flag =true;
				System.out.println("Its not pangram");
				break;
			}
		}
		if(flag==false)
			{
				System.out.println("Its pangram");
			}
		
	}

}

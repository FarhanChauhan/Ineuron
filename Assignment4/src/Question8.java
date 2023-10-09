
public class Question8 {

	public static void main(String[] args) 
	{
		String s1 = "farhan chauhan"; 
		int count=0;
		int maxcount= 0;
		char maxchar=' ' ;
		for(int i=0;i<s1.length();i++)
		{
			count = 1;
			for(int j=0;j<s1.length();j++)
			{
				if(i!=j && s1.charAt(i)==s1.charAt(j))
				{
					count++;
				}
				if(count>maxcount)
				{
					maxcount=count;
					maxchar=s1.charAt(i);
				}
			}
		}
		System.out.println(maxchar +" have appeared "+ maxcount +" times");
	}
}


public class Question3 {

	public static void main(String[]args) {
		String check = "2552";
		String str = "";
		
		for(int i=check.length()-1 ; i>=0 ;  i--)
		{
			str = str + check.charAt(i) ;
		}
		if(str.equals(check))
		{
			System.out.println("The string is Palllindrome");
		}
		else
		{
			System.out.println("The string is not pallinndrome");
		}
	}
} 

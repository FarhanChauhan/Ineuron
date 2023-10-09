import java.util.Arrays;

public class Question5 {

	public static void main(String[] args) {
		  String s1 = "Race";
		  String s2 = "Care";
		  
		  s1=s1.toLowerCase();
		  s2=s2.toLowerCase();
		  
		  char[] charArray1 =s1.toCharArray();
		  char[] charArray2 =s2.toCharArray();
		  
		  Arrays.sort(charArray1);
		  Arrays.sort(charArray2);
		  
		  if(Arrays.equals(charArray1, charArray2))
		  {
			  System.out.println("Both strings are Anagram of each other");
		  }
		  else
		  {
			  System.out.println("Strings are not anagram");
		  }
			  
	}

}

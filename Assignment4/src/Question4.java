
public class Question4 {

	public static void main(String[] args) {
		 String s1="farhanchauhan@";
		 int vowel=0;
		 int consonent=0;
		 int specialChar=0;
		 char[] c = s1.toCharArray();
		 for(int i=0;i<c.length;i++)
		 {
			 if(c[i]=='a' || c[i]=='e' || c[i]=='i' || c[i]=='o' || c[i]=='u')
			 {
				 vowel++;
			 }
			 else if(c[i]>=33 && c[i]<=64) 
			 {
				specialChar++;
			 }
			 else
			 {
				 consonent++;
			 }
		 }
		 System.out.println("No of Vowels are :"+vowel);
		 System.out.println("No of Consonents are :"+consonent);
		 System.out.println("No of Special chracterss are :"+specialChar);
	}

}

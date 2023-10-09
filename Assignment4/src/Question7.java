
public class Question7 {

	public static void main(String[] args) {
		 String s= "farhan chauhan";
		 int count=1;
		 for(int i=0;i<s.length();i++)
		 {
			 count=1;
			 for(int j=0;j<s.length();j++)
			 {
				 if(i!=j && s.charAt(i)==s.charAt(j))
				 {
					 count++;
				 }
			 }
			 if(count>1)
			 {
				 System.out.println("String does not have unique characters");
				 break;
			 }
		 }
		 if(count==1)
		 {
			 System.out.println("String have Unique charactes");
		 }
	}

}

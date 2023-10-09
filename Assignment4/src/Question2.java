
public class Question2 {

	public static void main(String[] args) {
		
		String str = "farhan chauhan";
		char[] name = str.toCharArray();
		
		int count=0 ;
		for(int i = 0 ;i < name.length ;i++) 
		{
			count = 0;
			for(int j=i+1 ; j< name.length ; j++) 
			{
				if(name[i]==name[j] && name[i]!=' ')
				{
					count++;	
					name[j]='0';
				}
			}
				
			if(count>0 && name[i]!='0')
			{
				System.out.println(name[i]);
			}
			
		}
	}
}

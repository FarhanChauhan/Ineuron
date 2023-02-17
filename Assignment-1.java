//Printing My Name 
public class Launch1{

	public static void main(String[] args) {
		int n= 7;
		for (int i=0 ; i<n ; i++)
		{
			//F
			for (int j=0 ; j<n ; j++)
			{
				if(i==0 || j==0 || i==(n-1)/2)  
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.print("   ");
			
			//A
			for (int j=0 ; j<n ; j++)
			{
				if(i==0&&j!=0&&j!=n-1 || j==0 && i!=0 || i==(n-1)/2 || j==(n-1)&&i>0)  
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.print("   ");
			
			//R
			for (int j=0 ; j<n ; j++)
			{
				if(i==0 || j==0 || i==(n-1)/2  || j==n-1&&i<(n-1)/2|| i==j&&i>(n-1)/2)  
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.print("   ");
			
			//H
			for (int j=0 ; j<n ; j++)
			{
				if(j==n-1 || j==0 || i==(n-1)/2 ||j==n-1&&i<(n-1)/2)  
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.print("   ");
			
			//A
			for (int j=0 ; j<n ; j++)
			{
				if(i==0&&j!=0&&j!=n-1 || j==0&&i>0 || i==(n-1)/2 || j==n-1&&i>0)  
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.print("   ");
			
			//N
			for (int j=0 ; j<n ; j++)
			{
				if( i==j  || j==0 || j==n-1)  
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			
			System.out.println();
		}
		
	}

}








//Question 1:-
public class launch2 {
	public static void main(String [] args) {
	int n= 7;
	for (int i=0 ; i<n ; i++)
	{
		//I
		for (int j=0 ; j<n ; j++)
		{
			if(i==0 || j==(n-1)/2 || i==n-1)  
			{
				System.out.print("*");
			}
			else
			{
				System.out.print(" ");
			}
		}
		System.out.print("   ");
		
		//N
		for (int j=0 ; j<n ; j++)
		{
			if( i==j  || j==0 || j==n-1)  
			{
             	System.out.print("*");
           	}
			else
			{
				System.out.print(" ");
			}
		}
		System.out.print("   ");
		
		//E
		for (int j=0 ; j<n ; j++)
		{
			if(i==0 || j==0 && i!=0 || i==(n-1)/2 || i==(n-1))  
			{
				System.out.print("*");
			}
			else
			{
				System.out.print(" ");
			}
		}
		System.out.print("   ");
		
		//U
				for (int j=0 ; j<n ; j++)
				{
					if(j==n-1&&i!=n-1 || j==0&&i!=n-1 || i==n-1&&j!=n-1&&j!=0||j==n-1&&i<(n-1)/2)  
					{
						System.out.print("*");
					}
					else
					{
						System.out.print(" ");
					}
				}
				System.out.print("   ");
		
		//R
		for (int j=0 ; j<n ; j++)
		{
			if(i==0 || j==0 || i==(n-1)/2  || j==n-1&&i<(n-1)/2|| i==j&&i>(n-1)/2)  
			{
				System.out.print("*");
			}
			else
			{
				System.out.print(" ");
			}
		}
		System.out.print("   ");
		
		
		//O
		for (int j=0 ; j<n ; j++)
		{
			if(i==0&&j!=0&&j!=n-1 || j==0&&i>0&&i!=n-1 || i==n-1&&j!=0&&j!=n-1 || j==n-1&&i>0&&i!=n-1)  
			{
				System.out.print("*");
			}
			else
			{
				System.out.print(" ");
			}
		}
		System.out.print("   ");
		
		//N
		for (int j=0 ; j<n ; j++)
		{
			if( i==j  || j==0 || j==n-1)  
			{
				System.out.print("*");
			}
			else
			{
				System.out.print(" ");
			}
		}
		
		System.out.println();
	}
	
        }
}






//Question 2:-
public class Launch3 {

	public static void main(String [] args)
	{
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=4;j++)
			{
				System.out.print(i);
			}
			System.out.println();	
		}
	}
}





//Question 3:-
public class Launch4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=14;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				
				if(i==0 || j==0 || i==n-1 ||  j==n-1 || i+j<=(n-1)/2 || j-i >= (n-1)/2)
				{
				System.out.print("*");
				}
				else
				{
				System.out.print(" ");
				}
				
			}
			System.out.println();
		}

	}

}






//Question 4:-
public class Launch5 {
		
	public static void main(String[] args) {

		int n=14;
		for(int i=0;i<=n;i++)
		{
			for(int j=0; j<n ; j++) {
				
				if(i+j >= n-1 +(n-1)/2 && i<=n-1 || i-j >= (n-1)/2 && i<=n-1 )
				{
					System.out.print("*");
				}
				else
				{
				System.out.print(" ");	
				}
			}
			System.out.println();
		}	
	}
}






//Question 5:-
public class Launch6 {

	public static void main(String[] args) {
	
		int n=14;
		for(int i=0;i<=n;i++)
		{
			for(int j=0; j<n ; j++) {
				
				if(i+j <= (n-1)/2 && i< n-1 || i-j >= (n-1)/2 && i< n-1 || i==0 || i == n-1 )
				{
					System.out.print("*");
				}
				else
				{
				System.out.print(" ");	
				}
			}
			System.out.println();
		}	
	}

}

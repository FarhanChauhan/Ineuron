package in.ineuron.main;

import java.util.Scanner;

class Guesser{
	
	int guessNum;
	
	int guessNum()
	{
		Scanner sc =new Scanner(System.in);
		System.out.print("Guesser kindly guess the number between 1 to 10 : ");
		guessNum=sc.nextInt();
		if(guessNum<1 || guessNum>10) 
		{
			System.out.println("Please guess a valid no.");
			guessNum=sc.nextInt();
			if(guessNum<1 || guessNum>10) 
			{
				System.out.println("Last chance to enter a valid no.");
				guessNum=sc.nextInt();
				if(guessNum<1 || guessNum>10)
				{
					System.out.println("START THE GAME AGAIN !");
					return 0;
				}
			}
		}
		return guessNum;
	}
	
}

class Player{
	
	int guessNum;
	StringBuffer name=new StringBuffer();
	static int count;
	int guessNum()
	{
		Scanner sc =new Scanner(System.in);
		System.out.print("Player " + ++count +" plese enter your name :  ");
		name.append(sc.nextLine());
		System.out.print("Player "+ count +" kindly guess the number : ");
		guessNum=sc.nextInt();
		if(guessNum<1 || guessNum>10) 
		{
			System.out.println("Please guess a valid no.");
			guessNum=sc.nextInt();
			if(guessNum<1 || guessNum>10) 
			{
				System.out.println("Last chance to enter a valid no.");
				guessNum=sc.nextInt();
				if(guessNum<1 || guessNum>10)
				{
					System.out.println("START THE GAME AGAIN !");
					return 0;
				}
			}
		}
		return guessNum;
	}
}

class Umpire{
	
	int numFromGuesser;
	int numFromPlayer1;
	int numFromPlayer2;
	int numFromPlayer3;
	int numFromPlayer4;
	
	void compare()
	{
		Guesser g = new Guesser();
		numFromGuesser = g.guessNum();
		Player p1 = new Player();
		Player p2 = new Player();
		Player p3 = new Player();
		Player p4 = new Player();
		numFromPlayer1 = p1.guessNum();
		numFromPlayer2 = p2.guessNum();
		numFromPlayer3 = p3.guessNum();
		numFromPlayer4 = p4.guessNum();
				
		if(numFromGuesser==numFromPlayer1) 
		{
			if(numFromGuesser == numFromPlayer2 && numFromGuesser==numFromPlayer3 && numFromGuesser==numFromPlayer4)
			{
				System.out.println("All Players WON the game ");
				System.out.println(" NEXT ROUND ");
				Umpire u2 = new Umpire();
				u2.compare();
			}
			else if(numFromGuesser == numFromPlayer2 && numFromGuesser==numFromPlayer3)
			{
				System.out.println(p1.name + "," +p2.name + "and"+ p3.name+" WON the game ");
				System.out.println(" NEXT ROUND ");
				Umpire u2 = new Umpire();
				u2.compare3();
			}
			else if(numFromGuesser == numFromPlayer2 && numFromGuesser==numFromPlayer4)
			{
				System.out.println(p1.name + "," +p2.name + "and"+ p4.name+" WON the game ");
				System.out.println(" NEXT ROUND ");
				Umpire u2 = new Umpire();
				u2.compare3();
			}
			else if(numFromGuesser == numFromPlayer3 && numFromGuesser==numFromPlayer4)
			{
				System.out.println(p1.name + "," +p3.name + "and"+ p4.name+" WON the game ");
				System.out.println(" NEXT ROUND ");
				Umpire u2 = new Umpire();
				u2.compare3();
			}
			else if(numFromGuesser == numFromPlayer2 )
			{
				System.out.println(p1.name +" and "+p2.name+" WON the game ");;
				System.out.println(" NEXT ROUND ");
				Umpire u2 = new Umpire();
				u2.compare2();
			}
			else if(numFromGuesser==numFromPlayer3)
			{
				System.out.println(p1.name +" and "+p3.name+" WON the game ");
				System.out.println(" NEXT ROUND ");
				Umpire u2 = new Umpire();
				u2.compare2();
			}
			else if(numFromGuesser==numFromPlayer4)
			{
				System.out.println(p1.name +" and "+p4.name+" WON the game ");
				System.out.println(" NEXT ROUND ");
				Umpire u2 = new Umpire();
				u2.compare2();
			}
			else
			{
				System.out.println(p1.name+" WON the game ");
			}
			
		}

		else if(numFromGuesser == numFromPlayer2)
		{
			if(numFromGuesser == numFromPlayer3 && numFromGuesser == numFromPlayer4)
			{
				System.out.println(p2.name +" , "+p3.name+ " and "+ p4.name + " WON the game ");
				System.out.println(" NEXT ROUND ");
				Umpire u2 = new Umpire();
				u2.compare3();
			}
			else if(numFromGuesser == numFromPlayer3)
			{
				System.out.println(p2.name +" and "+p3.name+" WON the game ");
				System.out.println(" NEXT ROUND ");
				Umpire u2 = new Umpire();
				u2.compare2();
			}
			else if(numFromGuesser == numFromPlayer4)
			{
				System.out.println(p2.name +" and "+p4.name+" WON the game ");
				System.out.println(" NEXT ROUND ");
				Umpire u2 = new Umpire();
				u2.compare2();
			}
			else
			{
				System.out.println(p2.name +" WON the game ");
			}
		}
		
		else if(numFromGuesser == numFromPlayer3)
		{
			if(numFromGuesser == numFromPlayer4)
			{
				System.out.println(p3.name +" and "+p4.name+" WON the game ");
				System.out.println(" NEXT ROUND ");Umpire u2 = new Umpire();
				u2.compare2();
			}
			else
			{
				System.out.println(p3.name +" WON the game ");
			}
		}
		
		else if(numFromGuesser == numFromPlayer4)
		{
			System.out.println(p4.name+ " WON the game ");
		}
		
		else
		{
			System.out.println("All Players LOST the game");
		}
		
	}
	
	
	
	
	void compare3() 
	{
		Player.count=0;
		Guesser g = new Guesser();
		numFromGuesser = g.guessNum();
		Player p1 = new Player();
		Player p2 = new Player();
		Player p3 = new Player();
		
		numFromPlayer1 = p1.guessNum();
		numFromPlayer2 = p2.guessNum();
		numFromPlayer3 = p3.guessNum();
		
		if(numFromGuesser == numFromPlayer1)
		{
			if(numFromGuesser == numFromPlayer2 && numFromGuesser == numFromPlayer3)
			{
				System.out.println("All Players WON the game");
			}
			else if(numFromGuesser == numFromPlayer2)
			{
				System.err.println(p1.name +" and "+p2.name+" WON the game ");
				System.out.println(" NEXT ROUND ");
				Umpire u2 = new Umpire();
				u2.compare2();
			}
			else if(numFromGuesser == numFromPlayer3)
			{
				System.out.println(p1.name+ " and " + p3.name+ " WON the game ");
				System.out.println(" NEXT ROUND ");
				Umpire u2 = new Umpire();
				u2.compare2();
			}
			else
			{
				System.out.println(p1.name+" WON the game");
			}
		}
		
		else if(numFromGuesser == numFromPlayer2)
		{
			if(numFromGuesser == numFromPlayer3)
			{
				System.out.println(p2.name +" and "+p3.name+" WON the game ");
				System.out.println(" NEXT ROUND ");
				Umpire u2 = new Umpire();
				u2.compare2();
			}
			else
			{
				System.out.println(p2.name+" WON the game ");
			}
		}
		
		else if(numFromGuesser == numFromPlayer3)
		{
			System.out.println(p3.name +" WON the game ");
		}
		
		else
		{
			System.out.println("All Players LOST the game");
		}
	}
	
	void compare2() 
	{
		Player.count=0;
		Guesser g = new Guesser();
		numFromGuesser = g.guessNum();
		Player p1 = new Player();
		Player p2 = new Player();
		
		numFromPlayer1 = p1.guessNum();
		numFromPlayer2 = p2.guessNum();
		 if(numFromGuesser == numFromPlayer1)
		 {
			 if(numFromGuesser == numFromPlayer2)
			 {
				 System.out.println("BOTH " + p1.name +" and "+ p2.name +" WON the game ");
				 System.out.println(" NEXT ROUND ");
					Umpire u2 = new Umpire();
					u2.compare2();
			 }
			 else
			 {
				 System.out.println(p1.name +" WON the game ");
			 } 
		 }
		 else if(numFromGuesser == numFromPlayer2)
		 {
			 System.out.println(p2.name +" WON the game ");
		 } 
		
		 else 
		 {
			 System.out.println("BOTH Player 1 and 2 LOST the game ");
		 }
	}
}



public class GuesserGame {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Umpire u = new Umpire();
		System.out.print("ENTER USERNAME : ");
		String username = sc.nextLine();
		if(!username.equalsIgnoreCase("FARHAN"))
			{
				System.out.println("INVALID USERNAME ");
				return;
			}
		System.out.print("ENTER PASSWORD : ");
		String password =sc.nextLine();
		if( !password.equals("farhan950"))
		{
			System.out.println("INVALID PASSWORD");
			return;
		}
		
		System.out.print("Please Enter no. of Players : ");
		int n=sc.nextInt();

		if(n==4) 
		{
			u.compare();
		}
		else if(n==3) 
		{
			u.compare3();
		}
		else if(n==2) 
		{
			u.compare2();
		}
		else 
		{
			System.out.println("No. of Players NOT VALID ");
			System.out.println("START THE GAME AGAIN !");
		}

	}
}

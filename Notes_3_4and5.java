import java.util.Scanner;

public class Notes_3_4and5 
{
	public static void main(String[] args)
	{
		/*
		int random;
		int guess;
		Scanner sc = new Scanner(System.in);
		
		random = ((int)(10*Math.random())) +1;
		System.out.print("Guess the number from 1 to 10: ");
		guess = sc.nextInt();
		
		if(guess > random) {
			System.out.println("Too high!");
		}
		else if(guess < random) {
			System.out.println("Too low!");
		}
		else if(guess == random) {
			System.out.println("Correct!");
		}
		
		System.out.println("The number was: " + random);
		*/
		
		int age;
		System.out.print("Enter your age: ");
		Scanner sc = new Scanner(System.in);
		age = sc.nextInt();
		
		if (age >= 14) {
			System.out.println("You are old enough to get a work permit.");
		}
		if (age >= 16) {
			System.out.println("You are old enough to drive.");
		}
		if (age >= 18) {
			System.out.println("You are old enough to vote.");
		}
		if (age >= 65) {
			System.out.println("You are old enough to retire without penalty.");
		}
		if (age < 14) {
			System.out.println("You are too young to do anything.");
		}
		/*
		//what is wrong with the following code? for a positive number, it prints both positive and zero
		//what value(s) of z will demonstrate the error? any positive number
		//how can you fix the error? put the second if as else if
		int z = 0;
		if(z > 0)
		{
			System.out.println("z is positive");
		}
		if(z < 0)
		{
			System.out.println("z is negative");
		}
		else
		{
			System.out.println("z is zero");
		}
		
		//what is wrong with the following code? it prints multiple grades
		//what value(s) of grade will demonstrate the error? 90-100: a,b,c,d  80-90: b,c,d    70-80: c,d
		//how can you fix the error? last three if statements as else if statements
		double grade = 97.7;
		if(grade >= 90)
			System.out.println("A");
		if(grade >= 80)
			System.out.println("B");
		if(grade >= 70)
			System.out.println("C");
		if(grade >= 60)
			System.out.println("D");
		else
			System.out.println("E");
		
		//What is the output of this code segment if the user enters 5? 
		//If the user enters 10? 
		//If the user enters 15? 
		//If the user enters 20? 
		//If the user enters 30? 
		//If the user enters 31?
		Scanner input = new Scanner( System.in );
		int x = input.nextInt();
		if (x <= 10)
			x = x + 11;
		else if (x <= 20)
			x = x + 11;
		else if (x <= 30)
			x = x + 11;
		else
			x = x + 11;
		System.out.println(x);
		
		//What is the output of this code segment if the user enters 5? 
		//If the user enters 10? 
		//If the user enters 15? 
		//If the user enters 20? 
		//If the user enters 30? 
		//If the user enters 31?
		x = input.nextInt();
		if (x <= 10)
			x = x + 11;
		if (x <= 20)
			x = x + 11;
		if (x <= 30)
			x = x + 11;
		else
			x = x + 11;
		System.out.println(x);
		
		// What is the output of this code segment if the user enters 5? UNDER TEN
		//If the user enters 8? UNDER TEN
		//If the user enters 10? EVEN
		x = input.nextInt( );
		if ( x < 10 )
			System.out.println("UNDER TEN");
		else if ( x % 2 == 0 )
			System.out.println("EVEN");
		else if ( x > 5 )
			System.out.println("OVER FIVE");
		else
			System.out.println("UNDER FIVE");
		
		//What is the output of this code segment if the user enters 5? UNDER TEN, UNDER FIVE
		//If the user enters 8? UNDER TEN, EVEN, OVER FIVE
		//If the user enters 10? EVEN, OVER FIVE
		x = input.nextInt( );
		if (x < 10)
			System.out.println("UNDER TEN");
		if ( x % 2 == 0 )
			System.out.println("EVEN");
		if ( x > 5 )
			System.out.println("OVER FIVE");
		else
			System.out.println( "UNDER FIVE" );
			*/
	}
}



/*
Nested if-else and if-else-if statements

Example 1: randomly generate a number from 1-10 inclusive.  Ask the user to guess a number 
	from 1-10.  Tell them if their number was too high, too low, or correct.
Example 2: based on input of age, tell the user if they are old enough to get a work permit,
	old enough to drive, old enough to vote, and old enough to retire without penalty
	(output all that are appropriate)
*/
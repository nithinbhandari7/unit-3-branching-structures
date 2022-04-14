import java.text.DecimalFormat;
import java.util.Scanner;

public class Notes_3_2and3 {
	public static void main(String[] args) {
		char payType;
		double salary;
		boolean isHourlyWorker;
		double hoursWorked;
		double hourlyPay;
		double weeklyPay;
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("$###,###.00");
		
		System.out.print("Are you paid hourly (h) or by salary (s): ");
		String input  = sc.next().toLowerCase();
		payType = input.charAt(0);
		if((!(payType == 'h' || payType == 's') || input.length() != 1)) {
			System.out.println("Your input is invalid.");
			return;
		}
		
		isHourlyWorker = (payType == 'h');
		
		if(isHourlyWorker) {
			System.out.print("Please enter your hours worked this week: ");
			hoursWorked = sc.nextDouble();
			if(hoursWorked < 0 || hoursWorked > 168) {
				System.out.println("Your input is invalid.");
				return;
			}
			System.out.print("Please enter your hourly pay: $");
			hourlyPay = sc.nextDouble();
			if(hourlyPay < 0) {
				System.out.println("Your input is invalid.");
				return;
			}
			if(hoursWorked > 40) { // overtime work
				weeklyPay = hourlyPay * 40 + 1.5 * hourlyPay * (hoursWorked - 40);
			}
			else {
				weeklyPay = hourlyPay * hoursWorked;
			}
		}
		else {
			System.out.println("Please enter your annual salary: $");
			salary = sc.nextDouble();
			weeklyPay = salary / 52;
		}
		System.out.println("Your weekly pay is " + df.format(weeklyPay));
	}
}

//scope of a variable: a description of where the variable can be used
//a variable is LOCAL to the block in which it is declared

/*
 * Control Structures
 * 1. Branching Structure
 * 		-if statement
 * 				if(boolean statement)
 * 				{
 * 					//code that will execute if statement is true
 * 				}
 * 
 * 		-if-else statement
 * 				if(boolean statement)
 * 				{
 * 					//code that will execute if statement is true
 * 				}
 * 				else
 * 				{
 * 					//code that will execute if statement is false
 * 				}
 * 
 * 		-if-else-if
 * 				if(boolean statement)
 * 				{
 * 					//code to execute if statement is true
 * 				}
 * 				else if(booleanstatement2)
 * 				{
 * 					//code to execute if statement2 is true
 * 				}
 * 				//as many else-if statements as necessary
 * 				else
 * 				{
 * 					//code to execute if none of the statements above are true
 * 				} 
 * 
 *  * 		-switch statement
 * 				controllingExpression must be of type int
 * 					int, long, short, enum, char
 * 				switch(controllingExpression)
 * 				{
 * 				case __:
 * 					//code to execute if case is matched
 * 					break;
 * 				case __:
 * 					//code to execute if case is matched
 * 					break;
 * 					.
 * 					.
 * 					.
 * 				default:
 * 					//code to execute if no case is matched
 * 				}
 * 
 */	

/*
Example 1a: write a program that calculates an hourly worker's weekly pay
			if the user enters a negative number for any input, tell them
			their input is invalid and quit the program

Example 1b: ask the user if they are paid hourly (1) or salary (2)
			set a boolean variable called isHourlyWorker to true or false
			based on the user's response

Example 1c: calculate the user's hourly or salary weekly pay

Example 2: Write a program that outputs an appropriate message based on 
			a user's letter grade in a class
*/
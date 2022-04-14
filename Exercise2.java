import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercise2 {
	public static void main(String[] agrs) {
		Scanner sc = new Scanner(System.in);
		int age;
		double weight;
		double finalPrice;
		DecimalFormat df = new DecimalFormat("$###,##0.00");
		
		System.out.print("Please enter your age: ");
		age = sc.nextInt();
		
		if (age < 6) {
			finalPrice = 0;
			System.out.println("Your final price is: " + df.format(finalPrice));
		}
		else if (age <= 15) {
			System.out.print("Please enter your weight in pounds: ");
			weight = sc.nextDouble();
			finalPrice = 0.09 * weight;
			System.out.println("Your final price is: " + df.format(finalPrice));
		}
		else if (age <= 59) {
			finalPrice = 10.95;
			System.out.println("Your final price is: " + df.format(finalPrice));
		}
		else {
			finalPrice = 8.95;
			System.out.println("Your final price is: " + df.format(finalPrice));
		}
	}
}

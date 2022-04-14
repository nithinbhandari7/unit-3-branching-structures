import java.util.Scanner;

public class Exercise1 {
	public static void main(String[] args) {
		int a;
		int b;
		int c;
		double root1;
		double root2;
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter a: ");
		a = sc.nextInt();
		System.out.print("Please enter b: ");
		b = sc.nextInt();
		System.out.print("Please enter c: ");
		c = sc.nextInt();
		root1 = ((-b)+(Math.pow((Math.pow(b, 2) - (4*a*c)), 0.5))) / (2*a);
		root2 = ((-b)-(Math.pow((Math.pow(b, 2) - (4*a*c)), 0.5))) / (2*a);
		
		if ((Math.pow(b, 2) - (4*a*c)) < 0) {
			System.out.println("There are no real roots.");
		}
		else if (root1 == root2) {
			System.out.println("The root is: " + root1);
		}
		else {
			System.out.println("The roots are: " + root1 + " and " + root2);
		}
	}
}

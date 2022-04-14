import java.util.Scanner;

public class Exercise3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String day;
		int dayNum;
		System.out.print("Please enter the day number: ");
		dayNum = sc.nextInt();
		
		if (dayNum == 1) {
			System.out.println("Monday");
		}
		else if (dayNum == 2) {
			System.out.println("Tuesday");
		}
		else if (dayNum == 3) {
			System.out.println("Wednesday");
		}
		else if (dayNum == 4) {
			System.out.println("Thursday");
		}
		else if (dayNum == 5) {
			System.out.println("Friday");
		}
		else if (dayNum == 6) {
			System.out.println("Saturday");
		}
		else if (dayNum == 7) {
			System.out.println("Sunday");
		}
	}
}

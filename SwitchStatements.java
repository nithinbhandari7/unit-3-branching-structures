import java.util.Scanner;

public class SwitchStatements {
	public static void main(String[] args) {
		String letterGrade;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please enter your letter grade: ");
		letterGrade = sc.next();
		
		switch(letterGrade) {
		case "A":
		case "a":
			System.out.println("Awesome");
			break;
		case "B":
		case "b":
			System.out.println("Brilliant");
			break;
		case "C":
		case "c":
			System.out.println("Completely Average");
			break;
		case "D":
		case "d":
			System.out.println("Dissapointing");
			break;
		case "E":
		case "e":
		case "F":
		case "f":
			System.out.println("Evicted");
			break;
			default:
				System.out.println("That is not a letter grade");
		}
	}
}
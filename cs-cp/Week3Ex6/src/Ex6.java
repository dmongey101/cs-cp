import java.util.Scanner;
public class Ex6 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		System.out.println("1. Single");
		System.out.println("2. Single with child");
		System.out.println("3. Married");
		
		System.out.print("Enter your status: ");
		int status = in.nextInt();
		
		System.out.print("How much have you earned this month?: ");
		double monthlySalary = in.nextInt();
		double taxBand = 0;
		double upperBound;
		double taxAmount = 0.0;
		if (status == 1) taxBand = 35300/12.0;
		else if (status == 2) taxBand = 39300/12.0;
		else if (status == 3) taxBand = 44300/12.0;

		if (monthlySalary > taxBand) {
			 upperBound = monthlySalary - taxBand;
			 taxAmount = (upperBound * 0.4) + (taxBand * 0.2);
		 } else {
			 taxAmount = monthlySalary * 0.2;
		 }
		
		System.out.println("Your monthly tax is: " + taxAmount);
	}

}

import java.util.Scanner;
public class Ex5 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter your weight in kg: ");
		
		double weight = in.nextDouble();
		
		System.out.print("Enter your height in cm: ");
		
		double height = in.nextDouble();

		double bmi = weight / (Math.pow(height/100, 2));
		
		System.out.println("Your BMI is: " + bmi);
		
		if (bmi < 18.5) System.out.println("You are underweight");
		else if (bmi >= 18.5 & bmi < 25) System.out.println("You are normal weight");
		else if (bmi >= 25 & bmi < 30) System.out.println("You are overweight");
		else if (bmi >= 30) System.out.println("You are obese");

	}

}

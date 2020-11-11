import java.util.Random;
import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		
		Random rn = new Random();
		
		Scanner in = new Scanner(System.in);
		
		int count = 10;
		
		int num = rn.nextInt(100) + 1;
		
		System.out.println(num);
		
		int guess;
		
		do {
			System.out.print("Enter a guess: ");
			guess = in.nextInt();
			
			if (guess > num && guess - num > 50) System.out.println("Much lower");
			else if (guess < num && num - guess > 50) System.out.println("Much higher");
			else if (guess > num) System.out.println("Lower");
			else if (guess < num) System.out.println("Higher");
			
			count--;
			if (guess == num) {
				System.out.println("Correct");
			} else {
				System.out.println("You have " + count + " goes left");
			}
			
			
		} while (guess != num && count != 0);
			
	}

}

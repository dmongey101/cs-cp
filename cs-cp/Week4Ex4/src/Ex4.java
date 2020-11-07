import java.util.Scanner;
import java.util.Random;
public class Ex4 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		Random number = new Random();
		
		String operator = null;
		
		int int1 = number.nextInt(45) + 5;
		int int2 = number.nextInt(45) + 5;
		
		int value = 0;
		int answer = 0;
		int guess = 0;
		
		int n = number.nextInt(2);
		
		switch(n) {
		case 1: operator = "+";
			break;
		case 2: operator = "-";
			break;
		}
		
		if (operator == "+") {
			value = int1 + int2;
			answer = value - int1;
			System.out.println(int1 + " + ? = " + value);
			System.out.println("Enter answer: ");
			guess = in.nextInt();
			if (guess == answer) System.out.println("Correct");
			else System.out.println("Incorrect. The correct answer is " + answer);
		} else {
			value = int1 - int2;
			answer = int1 - value;
			System.out.println(int1 + " - ? = " + value);
			System.out.println("Enter answer: ");
			guess = in.nextInt();
			if (guess == answer) System.out.println("Correct");
			else System.out.println("Incorrect. The correct answer is " + answer);
		}

	}

}

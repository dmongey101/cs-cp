import java.util.Scanner;
public class Ex4 {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter an integer: ");
		
		long num = in.nextLong();
		
		if (num == 0) System.out.println(num + " is 0");
		else if (num % 2 == 0) System.out.println(num + " is positive");
		else System.out.println(num + " is negative");
	}
}

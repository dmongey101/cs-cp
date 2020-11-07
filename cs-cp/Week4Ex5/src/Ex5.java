import java.util.Scanner;
public class Ex5 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter a number between 0 and 9999");
		
		int num = in.nextInt();
		
		if (num < 0 || num > 99999) System.out.println("Invalid number");
		else if (num < 10) System.out.println("000" + num);
		else if (num < 100) System.out.println("00" + num);
		else if (num < 1000) System.out.println("0" + num);
		else System.out.println(num);

	}

}

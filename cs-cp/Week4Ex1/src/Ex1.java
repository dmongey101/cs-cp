import java.util.Scanner;
import java.util.Arrays;
public class Ex1 {

	public static void main(String[] args) {
		
		String[] vowels = new String[]{"a","e", "o", "i", "u"};

		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter a single letter from the alphabet: ");
		
		String x = in.next();
		
		boolean valueIsTooLong = false;
		
		boolean contains = Arrays.stream(vowels).anyMatch(x::equals);
		
		if (x.length() > 1) 
		{
			contains = false;
			valueIsTooLong = true;
		}
		
		if (contains) System.out.println(x + " is a vowel");
		else if (!contains && valueIsTooLong) System.out.println("Invalid entry");
		else System.out.println(x + " is a consonant");

	}

}

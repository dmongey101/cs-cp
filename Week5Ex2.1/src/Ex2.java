import java.util.Arrays;
import java.util.Random;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random rn = new Random();
		
		int sum = 0;
		
		int[] arr = new int[20];
		
		for (int i = 0; i < arr.length; i++) {
			
			arr[i] = rn.nextInt(1000) + 1;
			sum += arr[i];
		}
		
		Arrays.sort(arr);
		
		System.out.println(Arrays.toString(arr));
		System.out.println("Smallest number = " + arr[0]);
		System.out.println("Largest number = " + arr[arr.length - 1]);
		System.out.println("The sum of the array = " + sum);
	}

}

import java.util.Scanner;
public class Ex2 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		double aX, aY, bX, bY, cX, cY;
		
		System.out.print("Enter x and y coordinates for A: ");
		
		aX = in.nextDouble();
		aY = in.nextDouble();

		System.out.print("Enter x and y coordinates for B: ");
		
		bX = in.nextDouble();
		bY = in.nextDouble();
		
		System.out.print("Enter x and y coordinates for C: ");
		
		cX = in.nextDouble();
		cY = in.nextDouble();
		
		double sideA = Math.sqrt(Math.pow(bX - aX, 2) + Math.pow(bY - aY, 2));
		double sideB = Math.sqrt(Math.pow(cX - bX, 2) + Math.pow(cY - bY, 2));
		double sideC = Math.sqrt(Math.pow(aX - cX, 2) + Math.pow(aY - cY, 2));
		
		double cosB = Math.pow(sideC, 2) + Math.pow(sideA, 2) - Math.pow(sideB, 2) / 2 * sideC * sideA;
		System.out.println(cosB);
		double angleB = Math.acos(cosB);
		
		System.out.println("Angle B is: " + angleB);
	}

}

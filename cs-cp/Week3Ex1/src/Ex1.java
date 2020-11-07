import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter the diameter of the cone: ");
		
		double diameter = in.nextDouble();
		
		System.out.print("Enter the height of the cone: ");
		
		double height = in.nextDouble();
		
		double radius = diameter / 2 ;
		double volume = Math.PI * Math.pow(radius, 2) * (height/3);
		double surfaceArea = Math.PI*radius*(radius+Math.sqrt(Math.pow(height, 2)+Math.pow(radius, 2)));
		
		System.out.println("The volume of the cone is: " + volume);
		System.out.println("The surface area of the cone is: " + surfaceArea);

	}

}

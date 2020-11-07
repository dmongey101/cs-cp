
public class Ex5 {

	public static void main(String[] args) {
		
		double diameterOfTin = 7.0;
		double radiusOfTin = diameterOfTin / 2;
		double heightOfTin = 10.5;
		double volumeOfCylinder = Math.PI * Math.pow(radiusOfTin, 2) * heightOfTin;
		double areaOfRectangle = diameterOfTin * 2 + heightOfTin * 2;
		double totalSurfaceArea =  Math.pow(diameterOfTin, 2) + (heightOfTin * diameterOfTin * 2) * 2;
		
		// A
		System.out.println("The voulume of the tin of soup is " + volumeOfCylinder + "cm^2");
		
		//B
		System.out.println("The area of the rectangular wrapper to cover the soup tin  is " + areaOfRectangle + "cms");
		
		//C
		System.out.println("The total surface area of cling film required to completely wrap the tin of soup is " + totalSurfaceArea + "cms");
		
		

	}

}

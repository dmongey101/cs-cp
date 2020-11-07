
public class Ex6 {

	public static void main(String[] args) {
		
		double aX = -5.5;
		double aY = 2.0;
		double bX = -3.0;
		double bY = -2.2;
		double cX = 1.0;
		double cY = 2;
		double dX = 7.0;
		double dY = 4.6;
		
		double distanceFromAtoB = Math.sqrt(Math.pow(bX - aX, 2) + Math.pow(bY - aY, 2));
		double distanceFromBtoC = Math.sqrt(Math.pow(cX - bX, 2) + Math.pow(cY - bY, 2));
		double distanceFromCtoD = Math.sqrt(Math.pow(dX - cX, 2) + Math.pow(dY - cY, 2));
		
		double sumOfDistances = distanceFromAtoB + distanceFromBtoC + distanceFromCtoD;
		
		System.out.println(sumOfDistances);

	}

}

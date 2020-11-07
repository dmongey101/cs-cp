
public class Ex4 {

	public static void main(String[] args) {
		
		double numberOfYearsInCentury = 100.0;
		
		double numberOfDaysInYear = 365.0;
		
		double numberOfLeapYearsInCentury = 25.0;
		
		double numberOfDaysInCentury = numberOfYearsInCentury * numberOfDaysInYear + numberOfLeapYearsInCentury;
		
		System.out.println("There are " + numberOfDaysInCentury + " days in the 21st century");
		
	}

}

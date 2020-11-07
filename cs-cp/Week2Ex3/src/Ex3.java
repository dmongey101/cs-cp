
public class Ex3 {

	public static void main(String[] args) {
		
		double tempInFahrenheit = 2192;
		
		double tempInCelsius = (tempInFahrenheit - 32.0) * 5.0/9;
		
		System.out.println(tempInFahrenheit + "°F is " + tempInCelsius + "°C");

	}

}

//0C = 32F
//12C = 53.6F 
//36.6C = 97.88000000000001F
//50C = 122F
//100C = 212F
//1200C = 2192F
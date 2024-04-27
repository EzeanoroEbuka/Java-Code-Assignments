import java.util.Scanner;

  public class Runway {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter velocity in meterPerSecond:");
		double velocity =scanner.nextDouble();

		System.out.println("Enter acceleration in meterPerSecond:");
		double acceleration =scanner.nextDouble();

		double constantValueForConvertingToMeterPerSecond = velocity * velocity;
		double constantValueForConvertingToMeterPerSecondSquare = acceleration * 2;
		
		doublel length =constantValueForConvertingToMeterPerSecond / constantValueForConvertingToMeterPerSecondSquare;

		System.out.printf("minimum length for this is %3f",meters);







     } 





}
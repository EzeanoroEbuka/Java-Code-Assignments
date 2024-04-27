import java.util.Scanner;
   
   public class Bmi {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your weight in pounds:");
		double weight =scanner.nextDouble();

		System.out.println("Enter your height in inches:");
		int height =scanner.nextInt();	

		double constantValueForConvertingToKilogram = 0.43559237;
		double constantValueForConvertingToMeter = 0.0254;

		double weightInkilogram = weight * constantValueForConvertingToKilogram;
		double heightInMeter = height * constantValueForConvertingToMeter;

		double bmi = weightInkilogram/(heightInMeter * heightInMeter);

		System.out.printf("Bmi is %3f",bmi);





    }
}

		
		 

		
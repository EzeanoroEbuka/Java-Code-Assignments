import java.util.Scanner;

   public class Ping {
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter integer in squaremeter:");
		double squaremeter =scanner.nextDouble();

		double constantValueForConvertingToPing =0.3025;

		double squaremeterInping = squaremeter * constantValueForConvertingToPing;

		System.out.printf("Ping is %3f",squaremeterInping);










    }


}
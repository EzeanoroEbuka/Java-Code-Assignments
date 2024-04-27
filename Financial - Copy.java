import java.util.Scanner;

  public class Financial {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter balance");
		double number1 = scanner.nextDouble(); 

		System.out.println("Enter annualInterestRate");
		 double number2 = scanner.nextDouble();

		double number3 = number1 * (number2 / 1200);

		System.out.printf("The interest is %.5f", number3); 




     }




}
import java.util.Scanner;
	
   public class NewBalance {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter accountNumber:");
		int number1 = scanner.nextInt();

		System.out.println("Enter startBalance:");
		int number2 = scanner.nextInt();

		System.out.println("Enter totalItemCharge:");
		int number3 = scanner.nextInt();

		System.out.println("Enter totalCreditApplied:");
		int number4 = scanner.nextInt();

		System.out.println("Enter allowedCreditLimit:");
		int number5 = scanner.nextInt();

		int newBalance = number2 + (number3 - number5);

		System.out.printf("credit limit exceeded %d",newBalance);


   }


}
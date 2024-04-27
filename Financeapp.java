import java.util.Scanner;

   public class Financeapp {

	public static void main(String[] args) {

	Scanner scanner = new Scanner(System.out);

	System.out.println("Enter investmentAmount:");
	double num1 = scanner.nextDouble();

	System.out.println("Enter annualInterestRate:");
	double num2 = scanner.nextDouble();

	System.out.println("Enter years:");
	int num3 = scanner.nextInt();

	(1 + monthlyInterestRate)  = annualInterestRate / 12;
	double num4 = num1 * (1 + monthlyInterestRate)  * num3;
	
	System.out.printf("futureInterestValue is $%.2f",num4);



     }


}
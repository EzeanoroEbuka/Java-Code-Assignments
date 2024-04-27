import java.util.Scanner;
  public class MortgageCalculator {
  public static void main(String[] args) {

	Scanner keyz = new Scanner(System.in);
	System.out.print("Enter Principal Amount: ");
	double principal = keyz.nextDouble();

	System.out.print("Enter The Annual Interest Rate: ");
	double rate = keyz.nextDouble();
	
	System.out.print("Enter Time Duration In Years: ");
	double years = keyz.nextDouble();

	double rateConversion = (rate / 100);

	double step1 = principal * (rateConversion / 12);

	double step2 = 1 + (rateConversion / 12);

	double step3 = (-(years * 12));

	double step4 = Math.pow(step2,step3);

	double step5 = 1 - step4;
	
	double formular = step1 / step5;
	System.out.println();
	
	System.out.printf("Your Monthly Payment is: $%,.2f",formular);


	}



}
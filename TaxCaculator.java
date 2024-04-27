import java. util. Scanner;

  public class TaxCaculator {

	public static void main(String[] args) {

		Scanner scanner =new Scanner(System.in);

 
		System.out.println("Enter citizenEarning"+":in USD");
		double CE = scanner.nextDouble(); 
		double totalTax = 0;

		for(double i =1; i = CE; i++) {
		System.out.println("Enter citizenName");
		String CN = scanner.nextString(); 
		totalTax += CE;
		}

		double num3 =totalTax * 0.2;
		
		System.out.println("total tax is: USD" + num3);

		scanner.close();


     }



}
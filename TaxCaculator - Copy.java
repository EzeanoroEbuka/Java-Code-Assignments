import java. util. Scanner;

  public class TaxCaculator {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter citizenEarning:");
		double num6 = scanner.nextDouble(); 
		double totalTax = 0;

		for(double i =1; i = num6; i++) {
		System.out.println("Enter citizenName");
		String num5 = scanner.nextString(); 
		totalTax += num5;
		}

		double num3 = totalTax * 0.2;
		
		System.out.println("total tax in: USD" + num3);

		scanner.close();


     }



}
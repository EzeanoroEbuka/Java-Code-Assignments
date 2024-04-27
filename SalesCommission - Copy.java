import java. util. Scanner;

  public class  SalesCommission {

	public static void main(String[] args) {

		Scanner scanner =new Scanner(System.in);

		System.out.println("Enter item");
		int num1 = scanner.nextInt();

		double totalSales = 0;

		for(int i = 1; i <= num1; i++) {
 		System.out.println("Enter value "+ i +": $");
		Double num2 = scanner.nextDouble();
		totalSales += num2;	
		}

		double num3 = totalSales * 0.09;
		double num4 = num3 + 200;
		
		System.out.println("saleperson's earnings is: $" + num4);

		scanner.close();

       }


}

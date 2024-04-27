import java.util.Scanner;

   public class Factors {

	public static void main(String[] args ) {

	Scanner scanner = new Scanner(System.in);

	System.out.println("Enter digit:");
	int digit = scanner.nextInt();
	
	System.out.println("The Factors Are :");
	for(int i =1; i <= digit ; i++) {
	    if (digit % i == 0) {
		System.out.println(i + "  ");
	      }
       }
    
    }


}
import java.util.Scanner;

   public class Trial {

	public static void main(String[] args ) {

	Scanner scanner = new Scanner(System.in);

	System.out.println("Enter digit:");
	int digit = scanner.nextInt();
	int count = 0;
	int Factor =0;

	while(count <= digit ) {
	count++;
	    if(digit % count == 0) {
		Factor += 1; 
	   }
		}   
		System.out.println("number of factors is " + Factor);
		System.out.println("The Factors Are :");
	for (int i =1; i <= digit ; i++) {
	    if (digit % i == 0) {
		System.out.println(i + "  ");
	      }

     }
  }

}













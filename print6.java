import java.util.Scanner;

   public class print6 {

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
		System.out.print("number of factors is " + Factor);
		
		
	      }
    
    }


	



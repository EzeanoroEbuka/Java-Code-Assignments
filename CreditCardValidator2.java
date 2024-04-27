import java.util.Arrays;
import java.util.Scanner;
  public class  CreditCardValidator2 {
   public static void main(String [] args) {
	
	Scanner scan = new Scanner(System.in);
  
	int[] collector = new int[16];

	System.out.println("Hellow, Kindly Enter Card Details to Verify");
	String accNumber = scan.nextLine();
	
	for(int count = 0;count < collector.length;count++) {
	collector[count] = accNumber.charAt(count) - 48; 
	}
	
	
	System.out.print(Arrays.toString(collector)  + " ");
	
   }


}
	









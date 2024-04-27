import java.util.Scanner;
 public class FactorPrint {
  public static void main(String[] args) {

	Scanner keyz = new Scanner(System.in);
	System.out.println("Enter A Number");
	int input = keyz.nextInt();

	int factor = 0;
	
	for(int counter = 1;counter <= input;counter = counter + 1) {	
	if (input % counter == 0) {
	factor = factor + 1;
	}
	
      }
	System.out.println(factor);
		
	
}

}
import java.util.Scanner;
  public class FunctionMainKata {
   public static void main(String[] args) {

	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter  Number");
	int num = scanner.nextInt();
	
	KataMethod key = new KataMethod();
	boolean squareRoot = key.squareInteger(num);
	System.out.print(squareRoot);
	
	
	
   }

}









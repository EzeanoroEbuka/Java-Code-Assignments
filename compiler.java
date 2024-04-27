import java. util. Scanner;
  public class Compiler {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

 		System.out.println("Enter first integer");
		int num1 = input.nextInt();
					
		
 		System.out.println("Enter second integer");
		int num2 = input.nextInt();

		if ( num1 == num2 ) System.out.println(0);

		if ( num1 > num2 ) System.out.println( 1 );
		
		if (num1 < num2) System.out.println( -1 );


		
		


	}
}



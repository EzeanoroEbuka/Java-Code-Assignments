import java. util. Scanner;

  public class PrimeFactor {

	public static void main(String[] args) {

		Scanner scanner =new Scanner(System.in);

 		System.out.println("Enter number");
		int num1 = scanner.nextInt();
		
		int count = 0;
		int factor = 0;

		while(count <= num1) {
		count++;
		if(num1 % count == 0) {
		factor += 1;
		
		}
		}
		if(factor == 2) {
		System.out.print("it is a prime number");

		}
		else { 
		System.out.print("it is not a prime number");
		}
}



}		
import java.util.Scanner;
 
 public class Arithemetics {    
    
	public static void main(String[] args) {
       
		Scanner scanner = new Scanner(System.in);
			
		System.out.println("Enter first integer");
		int number1 = scanner.nextInt();

		System.out.println("Enter second integer");
		int number2 = scanner.nextInt();
     
		int firstSquare = number1 * number1;
  		int secondSquare = number2 * number2;

		int sum = firstSquare + secondSquare;
		int difference = firstSquare - secondSquare;

		System.out.printf("sum of Squares is %d%n",sum);
		System.out.printf("difference of Squares is %d", difference);
	}
}
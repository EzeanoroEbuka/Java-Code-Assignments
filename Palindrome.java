import java.util.Scanner;
 public class Palindrome {
 public static void main(String[] args) {

	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter  Number");
	int userInput = scanner.nextInt();

	int originalNumber = userInput;
	int reverseNumber = 0;
	while(userInput != 0) {
		
		int sample = userInput % 10;
		reverseNumber = (reverseNumber * 10) + sample;
		userInput = (userInput / 10);
		
	}	
	if(reverseNumber == originalNumber)
	  System.out.println("True");
	
	
	if(reverseNumber != originalNumber)
		System.out.println("False");
	
	
   


 }
}
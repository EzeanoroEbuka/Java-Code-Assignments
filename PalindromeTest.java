import java.util.Scanner;
 public class PalindromeTest {
 public static void main(String[] args) {

	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter Palindrom Character");
	String userInput = scanner.nextLine();
	
	String reverseNumber = "";
	String originalNumber = userInput;
	for(int index = userInput.length()-1;index >= 0;index--) {
		reverseNumber = reverseNumber + userInput.charAt(index);
	}
	System.out.println();
	if(reverseNumber.equals(originalNumber)) 
		System.out.println("A Palindrome");

	else
		System.out.println("Not a Palindrome");

	System.out.println("The Reverse is: " + reverseNumber);

}


}



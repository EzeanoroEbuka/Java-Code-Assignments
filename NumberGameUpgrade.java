import java.util.Random;
import java.util.Scanner;
  public class NumberGameUpgrade {
   public static void main(String[] args) {
	Random randomNumbers = new Random();

	String prompt = """
	********************************
	* WELCOME TO GUESS NUMBER GAME *
	********************************
		""";
	System.out.println(prompt);
	Scanner keyz = new Scanner(System.in);
	int counter = 1;
	int randomValue = 1 + randomNumbers.nextInt(10);
	int input = 0;

	while(input != randomValue) {
	System.out.println("Enter Any Number");
	input = keyz.nextInt();

	if(input == randomValue) {
	System.out.println("Correct");break;}

	else {
	if(input < randomValue) {
	System.out.println("""
		Too Low!!!!!
		Try Again. 
			""");}

	else {
	if(input > randomValue) {
	System.out.println("""
		Too High!!!!!
		Try Again.
			""");}
		    }

		}

	    }

	
     

}

}
	
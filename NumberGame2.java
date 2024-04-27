import java.util.Scanner;
  public class NumberGame2 {
   public static void main(String[] args) {

	String prompt = """
	********************************
	* WELCOME TO GUESS NUMBER GAME *
	********************************
		""";
	System.out.println(prompt);
	Scanner keyz = new Scanner(System.in);
	int counter = 1;
	int num1 = 41;

	while(num1 == 41) {
	System.out.println("Enter Any Number");
	int input = keyz.nextInt();

	if(input == num1) {
	System.out.println("Correct");break;}

	else {
	if(input < num1) {
	System.out.println("""
		Too Low!!!!!
		Enter Any Number Again. 
			""");}

	else {
	if(input > num1) {
	System.out.println("""
		Too High!!!!!
		Enter Any Number Again.
			""");}
		    }

		}

	    }

	
     

}

}
	
import java.util.Scanner;
  public class NumberGame {
   public static void main(String[] args) {

	String prompt = """
	********************************
	* WELCOME TO GUESS NUMBER GAME *
	********************************
		""";
	System.out.println(prompt);

	Scanner keyz = new Scanner(System.in);
	int counter = 1;
	int num1 = 20;

	System.out.println("How Many times would Love To Play the Game");
	int times = keyz.nextInt();

	while(counter <= times) {
	System.out.println("Enter Any Number");
	int input = keyz.nextInt();

	if(input == num1) {
	System.out.println("Correct");}

	else 
	if(input < num1) {
	System.out.println("Too Low");}

	else {
	System.out.println("Too High");}
	counter++;
	}
     

}

}
	
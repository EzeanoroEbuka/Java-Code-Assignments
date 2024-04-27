import java.util.Scanner;
  public class Games {
  public static void main(String[] args) {

	String prompt ="""
	*************************
	* WELCOME TO BINARY HUB *
	*************************
		""";
	System.out.println(prompt);
	
	int counter = 0;
	
	Scanner keyz = new Scanner(System.in);
	
	System.out.println("How Many Times Would you Like To Play ??");
	int playTimes = keyz.nextInt();
	
	while(counter < playTimes){
	System.out.println("Enter 0 or 1 : ");
	int input = keyz.nextInt();

	if(input == 0) {
	System.out.println("1");}

	else{
	if(input == 1) {
	System.out.println("0");}
		
	else{
	System.out.println("Wrong Number");}
		}
	counter = counter + 1;
	}
	

}

}
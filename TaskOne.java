import java.util.Scanner;
public class TaskOne {
  public static void main(String[] args) {

	Scanner scan = new Scanner(System.in);

	int total = 0;
	
	for(int i = 0;i < 10;i++){
	
	System.out.println("Enter Scores");
	int scores = scan.nextInt();
	total += scores;
	}
	
	System.out.println("Sum of score is: " + total);

}


}

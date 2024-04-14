import java.util.Scanner;
public class TaskTwo {
  public static void main(String[] args) {

	Scanner scan = new Scanner(System.in);

	int total = 0;
	
	for(int count = 0;count < 10;count++){
	
		System.out.println("Enter Scores");
		int scores = scan.nextInt();
		total += scores;
		}
	double average = total / 10;

	System.out.printf("Average of score is: %.2f",average);

}


}

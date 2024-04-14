import java.util.Scanner;
public class TaskThree {
  public static void main(String[] args) {

	Scanner scan = new Scanner(System.in);

	int total = 0;
	
	for(int count = 1;count < 11;count++){
	
		System.out.println("Enter Scores");
		int scores = scan.nextInt();
		total += scores;
		}
	double average = total / 10;

	System.out.printf(" Sum of score is:  %d%n The Average is: %.2f",total,average);

}


}

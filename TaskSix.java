import java.util.Scanner;
public class TaskSix {
  public static void main(String[] args) {

	Scanner scan = new Scanner(System.in);

	int total = 0;
	
	for(int count = 1;count < 11;count++){
		System.out.println("Enter Scores");
		int scores = scan.nextInt();
		
		if(scores % 2 == 0) 
		total += scores;
	}

	double average = total / 10;

	System.out.printf("Average of score is: %.2f",average);
	

}


}

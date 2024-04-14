import java.util.Scanner;
public class TaskFive {
  public static void main(String[] args) {

	Scanner scan = new Scanner(System.in);

	int total = 0;
	
	for(int count = 1;count < 11;count++){
		System.out.println("Enter Scores");
		int scores = scan.nextInt();
		
		if(scores % 2 == 0) 
		total += scores;
	}
	System.out.printf(" Sum of scores is:  %d",total);

}


}

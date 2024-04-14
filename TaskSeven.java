import java.util.Scanner;
public class TaskSeven {
  public static void main(String[] args) {

	Scanner scan = new Scanner(System.in);

	double total = 0;
	
	for(int count = 1;count < 11;count++){
		System.out.println("Enter Scores");
		double scores = scan.nextDouble();
		
		if(scores % 2 == 0) 
		total += scores;
	}

	double average = total / 10;

	System.out.printf(" Sum of score is:  %.2f%n The Average is: %.2f",total,average);
	

}


}

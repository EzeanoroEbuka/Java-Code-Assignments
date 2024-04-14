import java.util.Scanner;
public class TaskEight {
  public static void main(String[] args) {

	Scanner scan = new Scanner(System.in);

	double total = 0;
	
	for(int count = 0;count < 10;count++){
		System.out.println("Enter Scores");
		double scores = scan.nextDouble();
		
		if(scores >= 0 && scores <= 100){
			total += scores;
		}
				
		
		else {
			System.out.println("Invalid Score");break;}
		}
		System.out.printf("Sum of scores is: %.2f",total);

		
	}

}
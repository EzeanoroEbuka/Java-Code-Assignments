import java.util.Scanner;

  public class StudentReport {
  public static void main(String[] arges) {

	Scanner bug2 = new Scanner(System.in);
	
	System.out.println("Enter Student Name");
	String input = bug2.nextLine();
	
	Scanner bug = new Scanner(System.in);
	System.out.println("Enter First Score");
	int score1 = bug.nextInt();

	System.out.println("Enter Second Score");
	int score2 = bug.nextInt();

	System.out.println("Enter Third Score");
	int score3 = bug.nextInt();
	
	int total = 100;
	int num1 = score1 + score2 + score3;
	int num2 = total - num1;

	if (num1 > 100) {
	System.out.println("invalid score cannot calculate");}
	
	else {
	if (num1 >= 50){
	System.out.printf("%s passed by %d",input,num1);}

		

	else {
	System.out.println("failed");}
		}

}


}

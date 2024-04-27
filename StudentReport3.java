import java.util.Scanner;

  public class StudentReport3 {
  public static void main(String[] arges) {

	String prompt = """
		::::::::::::::::::::::::
		: STUDENT REPORT GRADE :
		::::::::::::::::::::::::
		1. Menu
		2. Exit
		   """;
	System.out.print(prompt);
	Scanner bug3 = new Scanner(System.in);
	int reply = bug3.nextInt();
	switch(reply) {
	case 1:{

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
	if (num1 >= 80) {
	System.out.printf("%s passed by %d%nA",input,num1);}
	
	
	else {
	if (num1  >= 70) {
	System.out.printf("%s passed by %d%nB",input,num1);}
	
		
	else { 
	if (num1 >= 50) {
	System.out.printf("%s passed by %d%nC",input,num1);}
	

	else {
	if (num1 >= 40) {
	System.out.printf("%s passed by %d%nD",input,num1);}
		

	else {
	System.out.printf("%s%s%d%n",input, " failed by ", num1);}
		

     }
   }
  }
}
    }break;
	
	case 2:{System.out.println("THANKS For Exiting");}

	

    }

}



}

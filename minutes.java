import java.util.Scanner;
	
   public class Minutes {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter minutes:");
		int number1 = scanner.nextInt();

		int minuteInAYear = 60*24*365; 

		int year = number1 / minuteInAYear;

		int day = (number1 / 60/24 )%365;

		System.out.printf("minute is approx %dmin, and %d days",year,day);




     }

}
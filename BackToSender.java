import java.util.Scanner;
  public class BackToSender {
  public static void main(String[] args) {

	Scanner scan = new Scanner(System.in);
	System.out.println("Enter Total successful Delivery");
	int delivery = scan.nextInt();
	
	LogisticsDailyWage  keyz = new LogisticsDailyWage();
	int result = keyz.ReturnWages(delivery);
	System.out.println("Rider's wage for The Day is: " + result);

    }




}
import java.util.Scanner;

   public class Largestnumber {

	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	int total = 0;
	int numberCounter = 0;	

 	System.out.print("Enter number or -1 to quit: ");
	int num2 = input.nextInt();

	while (num2 != -1){
		total = total + num2;
		numberCounter = numberCounter + 1;

	System.out.print("Enter number or -1 to quit: ");
	num2 = input.nextInt();
	}

	
	if (numberCounter !=0) {

	 double num1 =(double) total / numberCounter;

	System.out.printf("%nTotal of the %d number entered is %d%n", numberCounter,total);

	System.out.printf("Largest digit is %.2f%n",num1);
	}
	 else {
	    System.out.println("No numbers were entered");
	 }
       }
 }
import java.util.Scanner;
  public class EstoreCalculator {
  	public static void main(String[] args) {
		   Scanner scan = new Scanner(System.in);
		   String prompt = """
		   <>>>>>>>>>>>>>>>>>>>>
		   <WELCOME TO E-STORE >
		   <>>>>>>>>>>>>>>>>>>>>
			""";
		   System.out.print(prompt);
		   System.out.println();
		   System.out.print("Please Enter Name: ");
		   String name = scan.nextLine();
	
		   double total = 0;
		   int count = 0;
	           while(count < 10){ 
		       count++;
		       System.out.print("Please Enter Cost of Item in Naira "+ count + ": ");
		       float item = scan.nextFloat();
		       total += item;
	           }
	
	           double discount = (total * 0.1);
	           double deduction = (total - discount);
	
	           System.out.println("Customer Name: " + name);
	           if(total >= 200) { 
		   	System.out.printf("Original Cost: %.2f%nYour Total Discounted cost is: %.2f%nThanks For Your Patronage !",total,deduction);
	           }

	           else {
		   	System.out.printf("Original Cost: %.2f%nDiscounted cost: 0(No Discount added)%nThanks For Your Patronage !",total);
	
	           }


}



}
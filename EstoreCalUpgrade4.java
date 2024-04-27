import java.util.Scanner;
  public class EstoreCalUpgrade4 {
    public static void main(String[] args) {
		Scanner keyz = new Scanner(System.in);
		String prompt = """
		<>>>>>>>>>>>>>>>>>>>>
		<WELCOME TO E-STORE >
		<>>>>>>>>>>>>>>>>>>>>
			""";
		System.out.print(prompt);
		System.out.println();
		System.out.print("Please Enter Customer Name: ");
		String name = keyz.nextLine();
	
		System.out.print("Please Enter Number of Item Purchased: ");
		int num1 = keyz.nextInt();

		System.out.print("Please Enter Percentage Discount: ");
		double num2 = keyz.nextDouble();

		double total = 0;
		int count = 0;
		for(;count < num1;) {
			count++;  
			System.out.print("Please Enter Cost of Item "+ count + ": ");
			float item = keyz.nextFloat();
			total += item;
		}
	
		double discount = (num2 / 100);
		double disPrice = (total * discount);
		double deduction = (total - disPrice);
		
		System.out.println();
		System.out.println("Customer Name: " + name);
		if(total >= 200) { 
			System.out.printf("Number Of Item Bought: %d%nPercentage Discount: %.2f%nOriginal cost is: %.2f%nDiscounted cost is: %.2f(Discount applied)%nThanks For Your Patronage",num1,num2,total,deduction);
	 	}
		else{
			System.out.printf("Number Of Item Bought: %d%nOriginal Cost is: %.2f%nDiscounted cost is: 0 (No Discount added)%nThanks For Your Patronage !",num1,total);
	
		}

}



}
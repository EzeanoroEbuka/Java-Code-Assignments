import java.util.Scanner;
  public class EstoreCalUpgrade3 {
    public static void main(String[] args) {
		Scanner keyz = new Scanner(System.in);
		String prompt = """
		<>>>>>>>>>>>>>>>>>>>>
		<WELCOME TO E-STORE >
		<>>>>>>>>>>>>>>>>>>>>
			""";
		System.out.print(prompt);
		System.out.println();
		System.out.print("Please Enter Name: ");
		String name = keyz.nextLine();
		
		double total = 0;
		int count = 0;
		float item = 0;
		System.out.print("Please Enter Percentage Discount: ");
		double num2 = keyz.nextDouble();
		
		

		while(item > -1) {
			count++;  
			System.out.print("Please Enter Cost of Item "+ count + " or -1 to quit" + ": ");
			item = keyz.nextFloat();
			total += item ;
		}
		double total2 = total + 1;
		double discount = (num2 / 100);
		double disPrice = (total2 * discount);
		double deduction = (total2 - disPrice);
		
		System.out.println();
		System.out.println("Customer Name: " + name);
		if(total >= 200) { 
			System.out.printf("Percentage Discount: %.2f%nOriginal cost is: %.2f%nDiscounted cost is: %.2f(Discount applied)%nThanks For Your Patronage !",num2,total2,deduction);
	 	}
		else{
			System.out.printf("Original Cost is: %.2f%nDiscounted cost is: 0 (No Discount added)%nThanks For Your Patronage !",total2);
	
		}

}



}
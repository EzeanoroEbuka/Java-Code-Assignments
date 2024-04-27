import java.util.Scanner;
  public class EstoreCalUpgrade5 {
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
		int count = 1;
		double item = 0;
		System.out.print("Please Enter Percentage Discount: ");
		double num2 = keyz.nextDouble();
		
		do{
			System.out.print("Please Enter Cost of Item "+ count + " or -1 to quit" + ": ");
			item = keyz.nextDouble();
			if(item == -1){
				break;}
			count++;  
	
			total += item ;	
		} 
		while(item > -1);
		
		
		double discount = (num2 / 100);
		double disPrice = (total * discount);
		double deduction = (total - disPrice);
		
		System.out.println();
		System.out.println("Customer Name: " + name);
		if(total >= 200) { 
			System.out.printf("Percentage Discount: %.2f%nOriginal cost is: %.2f%nDiscounted cost is: %.2f(Discount applied)%nThanks For Your Patronage !",num2,total,deduction);
	 	}
		else{
			System.out.printf("Original Cost is: %.2f%nDiscounted cost is: 0 (No Discount added)%nThanks For Your Patronage !",total);
	
		}

}



}
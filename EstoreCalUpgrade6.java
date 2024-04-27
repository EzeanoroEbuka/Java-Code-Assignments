import java.util.Scanner;
  public class EstoreCalUpgrade6 {
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
		String name = keyz.next();
		
		String[] itemName = new String[4];
		double[] itemCost = new double[4];

		double total = 0;
		for(int count = 1;count <= 3 ;count++) {
		System.out.print("What is The Name of Item "+ count + ": ");
		itemName[count] = keyz.next();
		
		System.out.print ("Please Enter Cost of the Item "+ count + ": ");	
		itemCost[count] = keyz.nextDouble();
			total += itemCost[count];
		    }
		double discountRate = 10;
		double discount = (discountRate / 100);
		double disPrice = (total * discount);
		double deduction = (total - disPrice);
		
		System.out.println();
		System.out.println("Customer Name: " + name);
		System.out.println();
		if (total > 200) { 
			System.out.println("Total Item \t cost");
			System.out.println( itemName[1] + "\t" + "\t" + itemCost[1]);
			System.out.println( itemName[2] + "\t" + "\t" + itemCost[2]);
			System.out.println( itemName[3] + "\t" + "\t" + itemCost[3]);
			System.out.printf("Percentage Discount: %.2f%nOriginal cost is: %.2f%nDiscounted cost is: %.2f(Discount applied)%nThanks For Your Patronage !",discountRate,total,deduction);
	 			}
		else{
			System.out.println("Total Item \t cost");
			System.out.println( itemName[1] + "\t" + "\t" + itemCost[1]);
			System.out.println( itemName[2] + "\t" + "\t" + itemCost[2]);
			System.out.println( itemName[3] + "\t" + "\t" + itemCost[3]);

			System.out.printf("Original Cost is: %.2f%nDiscounted cost is: 0 (No Discount added)%nThanks For Your Patronage !",total);
		     }
	
		

}



}
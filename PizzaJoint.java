import java.util.Scanner;
public class PizzaJoint {
  public static void main(String... args) {

	 Scanner scan = new Scanner(System.in);

	System.out.println("""
		**************************************
		** WELCOME TO IYA AFEEZ PIZZA JOINT **
		**************************************
			""");
	System.out.println("Enter Number Of People");
	int pizzaBoxes = scan.nextInt();

	System.out.println("""
		 ______________________________________________________
		|   PIZZA TYPE     | NUMBER OF SLICES | PRICE PER BOX  |
		|__________________|__________________|________________|       
		| 1 -> Sapa Size   |     4            |    2,000       |
		|__________________|__________________|________________|  
		| 2 -> Small Money |     6            |    2,400       |
		|__________________|__________________|________________|            
		| 3 -> Big Boys    |     8            |    3,000       |
		|__________________|__________________|________________|
		| 4 -> Odogwu      |     12           |    4,200       |
		|__________________|__________________|________________|      
					""");
	System.out.println("Enter Pizza Type");
	int pizzaType = scan.nextInt();
	switch(pizzaType) {
		case 1 -> sapaSize(pizzaBoxes);
 		case 2 -> smallMoney(pizzaBoxes);
		case 3 -> bigBoys(pizzaBoxes);
		case 4 -> odogwu(pizzaBoxes);
	}
   }	
	public static void sapaSize(int input) {
		
		System.out.println("SAPA SIZE TYPE PURCHASE");
		System.out.println();
		int sapaSlice = 4;
		int pricePerBox = 2000;
	
	 	
		int boxes = (input / sapaSlice);
		
		int underQuantity = (boxes * sapaSlice);
			if(underQuantity < input)
				boxes += 1;
		int sliceRemainder = (boxes  * sapaSlice) - input;

		int price = (pricePerBox * boxes);
		 
		System.out.println("Number of Boxes of Pizza to buy = " + boxes + " boxes");
		System.out.println();
		System.out.println("Number of Left Over Slice After Serving = " + sliceRemainder + " slices");
		System.out.println();
		System.out.println("Price = " + price);

	}	
	public static void smallMoney(int input) {
		
		System.out.println("SMALL MONEY TYPE PURCHASE");
		System.out.println();
		int sapaSlice = 6;
		int pricePerBox = 2400;
	
	 	
		int boxes = (input / sapaSlice);
		
		int underQuantity = (boxes * sapaSlice);
			if(underQuantity < input)
				boxes += 1;
		int sliceRemainder = (boxes  * sapaSlice) - input;

		int price = (pricePerBox * boxes);
		 
		System.out.println("Number of Boxes of Pizza to buy = " + boxes + " boxes");
		System.out.println();
		System.out.println("Number of Left Over Slice After Serving = " + sliceRemainder + " slices");
		System.out.println();
		System.out.println("Price = " + price);
	}
	public static void bigBoys(int input) {

		System.out.println("BIG BOYS TYPE PURCHASE");
		System.out.println();
		int sapaSlice = 8;
		int pricePerBox = 3000;
	
	 	
		int boxes = (input / sapaSlice);
		
		int underQuantity = (boxes * sapaSlice);
			if(underQuantity < input)
				boxes += 1;
		int sliceRemainder = (boxes  * sapaSlice) - input;

		int price = (pricePerBox * boxes);
		 
		System.out.println("Number of Boxes of Pizza to buy = " + boxes + " boxes");
		System.out.println();
		System.out.println("Number of Left Over Slice After Serving = " + sliceRemainder + " slices");
		System.out.println();
		System.out.println("Price = " + price);
	}
	public static void odogwu(int input) {

		System.out.println("ODOGWU TYPE PURCHASE");
		System.out.println();
		int sapaSlice = 12;
		int pricePerBox = 4200;
	
	 	
		int boxes = (input / sapaSlice);
		
		int underQuantity = (boxes * sapaSlice);
			if(underQuantity < input)
				boxes += 1;
		int sliceRemainder = (boxes  * sapaSlice) - input;

		int price = (pricePerBox * boxes);
		 
		System.out.println("Number of Boxes of Pizza to buy = " + boxes + " boxes");
		System.out.println();
		System.out.println("Number of Left Over Slice After Serving = " + sliceRemainder + " slices");
		System.out.println();
		System.out.println("Price = " + price);
	}


   


}
	

	
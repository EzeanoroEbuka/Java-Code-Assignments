import java.util.Scanner;
 public class SemicolonStore {
   public static void main(String[] args){
	Scanner scan = new Scanner(System.in);
		customerName();
		quantityPurchased();
		addmoreItems();
		 nameOfCashier();
   }
	public static void customerName(){
	  Scanner input1 = new Scanner(System.in);
	  System.out.println("What is the Customer's Name");
	  String cusName = input1.nextLine();
		itemPurchased();
	}
	public static  void itemPurchased(){
	  Scanner input2 = new Scanner(System.in);
	  System.out.println("What did the user buy?");
	  String itemName = input2.nextLine();
		quantityPurchased();
	}
	public static void quantityPurchased(){
	  Scanner scan = new Scanner(System.in);
	  System.out.println("How Many Pieces?");
	  int pieces = scan.nextInt();
		perUnitPurchase();

	}	
	public static void perUnitPurchase(){
	  Scanner scan2 = new Scanner(System.in);
	  System.out.println("How much per unit?");
	  int perUnit = scan2.nextInt();
		addmoreItems();
	}
	public static void addmoreItems(){
	   Scanner scan3 = new Scanner(System.in);
	  System.out.println("Add more items?");
	  String addItem = scan3.nextLine();
		if(addItem.equals("YES")) { 
		  itemPurchased();}
		else{
		    if(addItem.equals("NO")){
		 nameOfCashier();}    
		    }
	}
	
	public static void nameOfCashier(){
	  Scanner scanner = new Scanner(System.in);
	  System.out.println("What is your Name?");
	  String cashierName = scanner.nextLine();
		discountDeducted();
	}

	public static void  discountDeducted(){
	   Scanner scanner2 = new Scanner(System.in);
	  System.out.println("How much Discount will customer get?");
	  int discount = scanner2.nextInt();
	}

	    

}
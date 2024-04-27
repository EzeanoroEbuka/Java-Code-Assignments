import java.util.Scanner;
  public class Language2 {
  public static void main(String... arges) {

	String promt = """

	Hi welcome
	press
	1 -> For English
	2 -> For Yoruba
	3 -> For Hausa
	""";

	System.out.println(promt);
	Scanner keyz = new Scanner(System.in);
	int reply = keyz.nextInt();
	
	switch(reply) {
	   case 1 -> System.out.println("English");

	   case 2 -> System.out.println("Yoruba");

	   case 3 -> System.out.println("Hausa");

	   default -> System.out.println(" Pls Try Again");

	    }
	    
            
	String prompt2 = """

	press
	1 -> For One-on-One Chat
	2 -> For Balance Display
	3 -> To Check Other Enquiries
	""";
	
	System.out.println(prompt2);
	Scanner key = new Scanner(System.in);
	int response = key.nextInt();
	switch(response) {
	   case 1 -> System.out.println("One-on-one Chat"); 

	   case 2 -> System.out.println("Balance Display");

	   case 3 -> System.out.println("Other Enquiries");

	   default -> System.out.println("pls Enter The Return Number or Try Again");
	    
	   }

	


       }



}

	   












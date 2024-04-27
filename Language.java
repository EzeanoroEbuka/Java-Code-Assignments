import java.util.Scanner;
  public class Language {
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
	    
            

	
















}
}

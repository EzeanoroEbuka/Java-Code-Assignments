import java. util. Scanner;

  public class  GasMilage {

	public static void main(String[] args) {

		Scanner scanner =new Scanner(System.in);

		int totalMiles = 0;
		int totalGallons = 0;
		int trip = 0;
		
		System.out.println("Enter miles driven (-1 to exit):");
		int miles = scanner.nextInt();
		
		while(miles != -1) {
 		System.out.println("Enter gallon applied ");
		int gallon = scanner.nextInt();

		double milesPerGallon = (double) miles / gallon;

		System.out.printf("Miles per gallon for this trip: %.2f\n", milesPerGallon);

		totalMiles += 0;
	        totalGallons += 0;
	 	trip ++;

		System.out.println("Enter miles driven (-1 to exit):");
		miles = scanner.nextInt();

		}

		if (trip > 0) {
		     double combinedMilePerGallon = (double) totalMiles / totalGallons;
		System.out.printf("Combined miles per gallon for all trips: %.2f",combinedMilePerGallon);
	} else {
		System.out.println("No trip recorded.");
       }

	scanner.close();
   }
 
}
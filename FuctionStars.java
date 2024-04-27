public class FuctionStars {
 public static void main(String... kim) {
	//printStars(5);
	fullDaimond(5);
	//printStar();
}
public static void printStar() {
	System.out.print("*");
}
public static void printSpace() {
	System.out.print(" ");
} 
public static void printSpaceAndNextLine() {
	System.out.println(" ");
} 
public static void printStars(int numberOfStars) {
	 for(int i = 1;i <= numberOfStars;i++) {
		printStar();
	}
}
public static void printStarsAndSpace(int numberOfStars) {
	for(int i = 1;i <= numberOfStars;i++) {
		printStars(i);
		printSpaceAndNextLine();
	}
}
public static void invertedStars(int numberOfStars) {
	for(int i = numberOfStars;i >= 1;i--) {
		printStars(i);
		printSpaceAndNextLine();
	}
  }
public static void halfDaimond(int numberOfStars) {
	printStarsAndSpace(numberOfStars);
	invertedStars(numberOfStars - 1);

}
public static void square(int numberOfStars) {
 	for(int i = numberOfStars;i >= 1;i--) {
		printStars(numberOfStars);
		printSpace();
	}

}
public static void leftSidedStar(int numberOfStars) {
	for(int k = 1;k <= numberOfStars;k++){
		for(int i = numberOfStars;i > k;i--){
			printSpace();
		}
		for(int j = 1;j <= k;j++){
			printStar();
		}
		printSpaceAndNextLine();

	}
  }
public static void invertedleftSidedStar(int numberOfStars) {
	for(int k = 1;k <= numberOfStars;k++){
		for(int i = 1;i <= k;i++){
			printSpace();
		}
		for(int j = numberOfStars;j >= k;j--){
			printStar();
		}
		printSpaceAndNextLine();
	}
}

public static void fullDaimond(int numberOfStars) {

	leftSidedStar(numberOfStars);
	printStarsAndSpace(numberOfStars);
	invertedleftSidedStar(numberOfStars - 1);
	invertedStars(numberOfStars - 1);
	
}

}
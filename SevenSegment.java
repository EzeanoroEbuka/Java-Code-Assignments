import java.util.Arrays;
import java.util.Scanner;
 public class SevenSegment {
   public static void main(String...args){
	Scanner scan = new Scanner(System.in);
	
	int[] numbers = new int[7];
	int count = 0;
	for(;count < 7;count++) {

	System.out.println("Enter Binary Number");
	int number = scan.nextInt();
	if(number > 1 )
		number = 1;
	if(number < 0)
		number = 0;
	numbers[count]= number;
	}
	String a = ("""
		_____
		 """)
	String b = ("""
		
 
	for(int counter = 0;counter <= count;count++) {
	
}



}
	System.out.print(Arrays.toString(numbers));

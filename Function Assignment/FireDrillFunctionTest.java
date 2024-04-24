import java.util.Arrays;
import java.util.Scanner;
 public class FireDrillFunctionTest {
   public static void main(String...args){
	Scanner scan = new Scanner(System.in);
	
	int[] numbers = new int[3];
	int count = 0;
	for(;count < 3;count++) {

	System.out.println("Enter Binary Number");
	int number = scan.nextInt();
	numbers[count]= number;
	}
	
	int[] result = FireDrillNightTask.funcionOfDoubleSize(numbers);

	System.out.print(Arrays.toString(result));
}


}




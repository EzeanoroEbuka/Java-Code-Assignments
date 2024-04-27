import java.util.Scanner;  
   public class Bmi {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your weight:");
		floatweight =scanner.nextfloat();

		System.out.println("Enter your height:");
		 intheight =scanner.nextfloat();	

		System.out.println("Enter the value unit of weight in pounds");
		floatweight =(0.4534);
		
		System.out.println("Enter the value unit of height in meters");
		doubleheight =(0.0254);

		doubleheightSquare = (height * height);

		doubleBmi = doubleweight / (height * height);

		System.out.printf("heightSquare is %d%n",Square);
		System.out.printf("weight divid heightSquare is %d",Bmi);



   }

}
import java.util.Scanner;
  public class QuadraticEquation {
  public static void main(String[] args) {

	Scanner keyz = new Scanner(System.in);
	System.out.println("Enter Coefficients of x2");
	double num1 = keyz.nextDouble();

	System.out.println("Enter Coefficients of x");
	double num2 = keyz.nextDouble();
	
	System.out.println("Enter Intercept");
	double num3 = keyz.nextDouble();
	
	double discriminant = Math.pow(num2,2) + (-4 * num1 * num3);

	double discriminant2 = Math.sqrt(discriminant);

	double divisor = (2 * num1);

	double negativeValue = (-num2 - discriminant2) / divisor;
	double positiveValue = (-num2 + discriminant2) / divisor ;
	
	System.out.printf("The value of x are: %nx = %.4f or %nx = %.4f",positiveValue,negativeValue);











}

}



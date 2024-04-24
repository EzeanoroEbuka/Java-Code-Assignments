 public class  KataMethod {
public static boolean evenNumber(int userInput) {
	
	if(userInput % 2 == 0) {

	   return true;
}
	else {

	   return false;
}

	
}


public static boolean primeNumbers(int userInput) {

	int factors = 0;
	for(int count = 1;count <= userInput;count++) {
		if(userInput % count == 0)
		factors += 1;
	} 
	if(factors == 2){

		return true;}
	else {

		return false;}

}



public static int positiveDifference(int userInput1 , int userInput2) {

	int result = (userInput1 - userInput2);
 	if(userInput2 > userInput1){
		result *= -1;
	}
	else {
		result *= 1;
	}
	return result;


}


public static double divideInteger(double userInput1,double userInput2){
	double result = (userInput1 / userInput2);
	if(userInput2 == 0){
		result = 0;
	}
	return result;
	

}




public static int factorOfInteger(int userInput) {
	int count = 1;
	int factor = 0;
	int total = 1;
	for(;count <= userInput;) {
		if(userInput % count == 0)	
			factor++;
		count = count + 1;
	}
	
		
		return factor;
  }






public static boolean squareInteger(int userInput) {
	
	boolean squareRoot = false;
	
	for(int count = 1;count < userInput;count++) {
		if(count * count == userInput){
			squareRoot = true;}
		
	
	}
	return squareRoot;
}
			




public static boolean palindrome(int userInput) {
	
	boolean palinNumber = false;
	int originalNumber = userInput;
	int reverseNumber = 0;
	while(userInput != 0) {
		int sample = userInput % 10;
		reverseNumber = (reverseNumber * 10) + sample;
		userInput = (userInput / 10);	
	}	
	if(reverseNumber == originalNumber){
	   palinNumber = true;
	   }

	else {
	    palinNumber = false;
	}
 	return palinNumber;
   
}

public static int  factorial(int userInput) {

	int count = 1;
	int total = 1;
	while(count <= userInput){
		total *= count;
		count++;
	}	
	 return	 total;
     }

}
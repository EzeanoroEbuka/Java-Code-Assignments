public class FireDrillNightTask {
 public static int[] funcionOfZerosAndOnes(int... userInput) {
	
	int[] outPut = new int[userInput.length];

	for(int count = 0;count < userInput.length;count++){
		if(userInput[count] % 2 == 1)
			userInput[count] = 1;
			outPut[count] = userInput[count];
		
		if(userInput[count] % 2 == 0)
			userInput[count] = 0;
			outPut[count] = userInput[count];
	}
	return outPut;

}


public static boolean[] functionOfTrueAndFalse(int...userInput) {

	boolean[] outPut = new boolean[userInput.length];

	for(int count = 0;count < userInput.length;count++){
		if(userInput[count] % 2 == 1)
			outPut[count] = true;
			
		if(userInput[count] % 2 == 0)
			outPut[count] = false;
	}		
	return outPut;

   }

public static int[] funcionOfDoubleSize(int... userInput) {
	
	int[] outPut = new int[userInput.length * 2];
	 int i = 0;
	for(int counter = 1;counter <= 2;counter++){
		for(int count = 0;count < userInput.length;count++){
			outPut[i] = (userInput[count] * counter);
			i++;
		}	
	
	}
	return outPut;

}


} 

public class MultiplyArray {
 
public static int multiplyer(int[] input) {

	int[] firstIndex = new int[input.length];
	int[]	arrays = new  int[input.length];
	int maximum = 0;
	int totalMax = 0;
	
	for(int counter = 0;counter < input.length;counter++) {
		for(int count = 0;count < input.length;count++) {
			firstIndex[count] = input[counter] * input[count];	
				if(input[counter] == input[count]){firstIndex[count] = 0;}
				
				if(firstIndex[counter] > maximum){
					maximum = firstIndex[counter];}
		}
		arrays[counter] = maximum;
		if(arrays[counter] > totalMax){
					totalMax = arrays[counter];}
	}
	return totalMax;
		
		
}

public static int getMaximumProduct(int[] numbers){

	return 0;

}



}
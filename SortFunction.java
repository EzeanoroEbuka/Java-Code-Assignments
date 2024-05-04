public class SortFunction {


public static int[] inputtingOnes(int[] input) {

	int[] checker = new int[input.length];
	for(int i = 0;i < input.length;i++) {
		checker[i] = 1;
	}
	return checker;

  }


public static int[] positionSorting(int[] input) {
	
	int[] positioning = inputtingOnes(input);
	
	for(int counter = 0; counter < input.length;counter++) {
		for(int count = 0;count < input.length;count++) {
			 if(input[count] > input[counter]){
				  positioning[counter] += 1;
			}
		}
	}
	return  positioning;
}  


}

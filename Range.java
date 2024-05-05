public class Range {
  public static int rangeOfNumber(int[] inputs){ 

int maximum = 0;
int minimum = inputs[0];
for(int count = 0;count < 5;count++) {
	if(inputs[count] > maximum) 
		maximum = inputs[count];

	if(inputs[count] < minimum)
		minimum = inputs[count];

	}
 int rangeValue = maximum - minimum;

return rangeValue;


}



}
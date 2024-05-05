import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaximumTest { 

	@Test
	public void testThatTheMaximumGivesBackTheMaximumNumber() {
	int input = [1,2,2,2,3];
	int[] max = Maximum.maximumNumber(input);
	int expectedMax = 3;
	assertEquals(expectedMax,max);

}




}
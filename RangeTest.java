import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals; 

public class RangeTest {

	@Test
	public void testThatTheRangeGivesBackTheRangeOfTheInput() {
	int[] input = {9,2,1,8,6};
	int range = Range.rangeOfNumber(input);
	int expectedrange = 8;
	assertEquals(expectedrange,range);
}
 
}
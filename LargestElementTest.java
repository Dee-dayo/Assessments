import org.junit.jupiter.api.Test;
import  static org.junit.jupiter.api.Assertions.assertEquals;

public class LargestElementTest {
	
	@Test
	public void testCanGetLargestElement() {
		LargestElement example = new LargestElement() ;
		int[] arr = new int[] {75, 967, 745, 853} ;
		assertEquals (853) ;
	}

}
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

	@Test
	public void testThisCalcutorCanAdd() {
		Calculator myCalc = new Calculator () ;
		int sum = myCalc.add(3, 5) ;
		assertEquals(11, sum) ;

	}
}
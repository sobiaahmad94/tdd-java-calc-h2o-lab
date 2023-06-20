
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class CalculatorTest {
    Calculator calculator;
    @Before
    public void before(){
        calculator = new Calculator();
    }
    @Test
    public void canAdd(){
        assertEquals(2, calculator.add(1, 1));
    }
    @Test
    public void canSubtract(){
        assertEquals(4, calculator.subtract(6, 2));
    }
    @Test
    public void canMultiply(){
        assertEquals(12, calculator.multiply(4, 3));
    }
    @Test
    public void canDivide(){
        assertEquals(2.0, calculator.divide(10.0, 5.0), 0.01);
    }
}
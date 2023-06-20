import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class WaterBottleTest {
    WaterBottle waterBottle;
    WaterBottle waterBottle2;
    @Before
    public void before(){
        waterBottle = new WaterBottle(100);
    }
    @Test
    public void hasVolume(){
        assertEquals(100, waterBottle.getVolume());
    }
    @Test
    public void canDrink(){
        assertEquals(90, waterBottle.drink());
    }
    @Test
    public void canEmpty(){
        assertEquals(0, waterBottle.empty());
    }
    @Test
    public void canFill(){
        waterBottle2 = new WaterBottle(80);
        assertEquals(100, waterBottle2.fill());
    }
}
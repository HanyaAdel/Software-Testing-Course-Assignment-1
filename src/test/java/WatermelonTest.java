import static org.junit.Assert.*;
import org.junit.Test;

public class WatermelonTest {
    @Test
    public void checkIfEven(){
        Watermelon watermelon = new Watermelon();
        assertEquals(true, watermelon.isEven(8));
        assertEquals(false, watermelon.isEven(3));
        assertEquals(false, watermelon.isEven(2));
        assertEquals(true, watermelon.isEven(10));

    }

}